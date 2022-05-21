package tripulacion.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import generics.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tripulacion.commands.AgregarVueloPiloto;
import tripulacion.events.PilotoModificado;
import tripulacion.events.TripulacionCreada;
import tripulacion.events.VueloAgregadoPiloto;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdTripulacion;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarVueloPilotoUseCaseTest {
    @InjectMocks
    private AgregarVueloPilotoUseCase agregarVueloPilotoUseCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarVueloPilotoUseCaseHappyTest(){
        //arrange
        var idTripulacion=IdTripulacion.of("vu");
        var idPiloto=IdPiloto.of("piv");
        var fecha=new Fecha(LocalDate.now());
        var command=new AgregarVueloPiloto(idTripulacion,idPiloto,fecha);
        when(repository.getEventsBy("vu")).thenReturn(history());
        agregarVueloPilotoUseCase.addRepository(repository);

        //act

        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(agregarVueloPilotoUseCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var vueloAgregadoPiloto=(VueloAgregadoPiloto)events.get(0);

        //assert
        Assertions.assertEquals(idPiloto,vueloAgregadoPiloto.getIdPiloto());
        Assertions.assertEquals(fecha,vueloAgregadoPiloto.getFecha());

    }

    private List<DomainEvent> history() {
        var idPiloto=IdPiloto.of("piv");
        var nombre=new Nombre("ll");
        var telefono=new Telefono("2211");
        var correo=new Correo("p@gp.com");
        var datosPersonales=new DatosPersonales( nombre,telefono,correo);
        var tripulacionCreada=new TripulacionCreada(idPiloto,datosPersonales);
        return List.of(tripulacionCreada);
    }


}