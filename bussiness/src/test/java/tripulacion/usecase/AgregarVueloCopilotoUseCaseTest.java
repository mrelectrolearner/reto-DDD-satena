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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tripulacion.commands.AgregarVueloCopiloto;
import tripulacion.commands.AgregarVueloPiloto;
import tripulacion.events.CopilotoCambiado;
import tripulacion.events.TripulacionCreada;
import tripulacion.events.VueloAgregadoCopiloto;
import tripulacion.events.VueloAgregadoPiloto;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdTripulacion;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarVueloCopilotoUseCaseTest {
     @InjectMocks
     private AgregarVueloCopilotoUseCase agregarVueloCopilotoUseCase;

     @Mock
     private DomainEventRepository repository;

     @Test
     void agregarVueloCopilotoUseCase(){
         var idTripulacion= IdTripulacion.of("vu");
         var idCopiloto = IdCopiloto.of("piv");
         var fecha=new Fecha(LocalDate.now());
         var command=new AgregarVueloCopiloto(idTripulacion, idCopiloto,fecha);
         when(repository.getEventsBy("vu")).thenReturn(history());
         agregarVueloCopilotoUseCase.addRepository(repository);

         //act

         var events= UseCaseHandler
                 .getInstance()
                 .syncExecutor(agregarVueloCopilotoUseCase,new RequestCommand<>(command))
                 .orElseThrow()
                 .getDomainEvents();
         var vueloAgregadoPiloto=(VueloAgregadoCopiloto)events.get(0);

         //assert
         Assertions.assertEquals(idCopiloto,vueloAgregadoPiloto.getIdCopiloto());
         Assertions.assertEquals(fecha,vueloAgregadoPiloto.getFecha());
         Mockito.verify(repository).getEventsBy("vu");
     }

    private List<DomainEvent> history() {
        var idPiloto=IdPiloto.of("piv");
        var nombre=new Nombre("ll");
        var telefono=new Telefono("2211");
        var correo=new Correo("p@gp.com");
        var nombreCopiloto=new Nombre("copll");
        var telefonoCopiloto=new Telefono("222211");
        var correoCopiloto=new Correo("cop@gp.com");
        var datosPersonales=new DatosPersonales( nombre,telefono,correo);
        var tripulacionCreada=new TripulacionCreada(idPiloto,datosPersonales);
        var datosCopiloto=new DatosPersonales(nombreCopiloto,telefonoCopiloto,correoCopiloto);
        var copilotoAgregado=new CopilotoCambiado(datosCopiloto);
        tripulacionCreada.setAggregateRootId("vu");
        copilotoAgregado.setAggregateRootId("piv");
        return List.of(tripulacionCreada,copilotoAgregado);
    }

}