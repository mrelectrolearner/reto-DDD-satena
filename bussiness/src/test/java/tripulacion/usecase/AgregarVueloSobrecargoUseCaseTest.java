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
import tripulacion.commands.AgregarVueloSobrecargo;
import tripulacion.events.SobrecargoAgregado;
import tripulacion.events.TripulacionCreada;
import tripulacion.events.VueloAgregadoPiloto;
import tripulacion.events.VueloAgregadoSobrecargo;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdSobrecargo;
import tripulacion.identities.IdTripulacion;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarVueloSobrecargoUseCaseTest {
    @InjectMocks
    private AgregarVueloSobrecargoUseCase agregarVueloSobrecargoUseCase;
    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarVueloSobrecargoUseCaseHappyTest(){
        //arrange
        var idTripulacion= IdTripulacion.of("vu");
        var idSobrecargo = IdSobrecargo.of("piv");
        var fecha=new Fecha(LocalDate.now());
        var command=new AgregarVueloSobrecargo(idTripulacion, idSobrecargo,fecha);
        when(repository.getEventsBy("vu")).thenReturn(history());
        agregarVueloSobrecargoUseCase.addRepository(repository);

        //act

        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(agregarVueloSobrecargoUseCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var vueloAgregadoSobrecargo=(VueloAgregadoSobrecargo)events.get(0);

        //assert
        Assertions.assertEquals(idSobrecargo,vueloAgregadoSobrecargo.getIdSobrecargo());
        Assertions.assertEquals(fecha,vueloAgregadoSobrecargo.getFecha());

    }

    private List<DomainEvent> history() {
        var idPiloto=IdPiloto.of("piv");
        var nombre=new Nombre("ll");
        var telefono=new Telefono("2211");
        var correo=new Correo("p@gp.com");

        var idSobrecargo=IdSobrecargo.of("sob");
        var nombreSobrecargo=new Nombre("copll");
        var telefonoSobrecargo=new Telefono("222211");
        var correoSobrecargo=new Correo("cop@gp.com");

        var datosPersonales=new DatosPersonales( nombre,telefono,correo);
        var datosSobrecargo=new DatosPersonales(nombreSobrecargo,telefonoSobrecargo,correoSobrecargo);

        var tripulacionCreada=new TripulacionCreada(idPiloto,datosPersonales);

        var agregarSobrecargo=new SobrecargoAgregado(idSobrecargo,datosSobrecargo);
        return List.of(tripulacionCreada,agregarSobrecargo);
    }

}