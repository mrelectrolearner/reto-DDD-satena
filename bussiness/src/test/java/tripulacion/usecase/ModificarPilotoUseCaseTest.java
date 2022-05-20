package tripulacion.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Correo;
import generics.values.DatosPersonales;
import generics.values.Nombre;
import generics.values.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pasajero.events.VueloReservado;
import tripulacion.commands.ModificarPiloto;
import tripulacion.events.PilotoModificado;
import tripulacion.events.TripulacionCreada;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdTripulacion;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ModificarPilotoUseCaseTest {
    @InjectMocks
    private ModificarPilotoUseCase modificarPilotoUseCase;
    @Mock
    private DomainEventRepository repository;

    @Test
    void modificarPilotoUseCaseHappyTest(){
        //arrange
        var nombre=new Nombre("lp");
        var telefono=new Telefono("111");
        var correo=new Correo("pp@gp.com");
        var datosPersonales=new DatosPersonales( nombre,telefono,correo);
        var idTripulacion=IdTripulacion.of("trpip");
        var idPiloto=IdPiloto.of("pil");
        var command=new ModificarPiloto(idTripulacion,idPiloto,datosPersonales);
        when(repository.getEventsBy("trpip")).thenReturn(history());
        modificarPilotoUseCase.addRepository(repository);

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(modificarPilotoUseCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var pilotoModificado=(PilotoModificado)events.get(0);

        //assert
        Assertions.assertEquals(datosPersonales,pilotoModificado.getDatosPersonales());
        Assertions.assertEquals(idTripulacion.toString(),pilotoModificado.aggregateRootId());

    }

    private List<DomainEvent> history() {
        var idPiloto=IdPiloto.of("x");
        var nombre=new Nombre("ll");
        var telefono=new Telefono("2211");
        var correo=new Correo("p@gp.com");
        var datosPersonales=new DatosPersonales( nombre,telefono,correo);
        var tripulacionCreada=new TripulacionCreada(idPiloto,datosPersonales);
        return List.of(tripulacionCreada);
    }

}