package pasajero.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
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
import pasajero.commands.CheckIn;
import pasajero.events.Checked;
import pasajero.events.PasajeroCreado;
import pasajero.identities.IdAsiento;
import pasajero.identities.IdEquipaje;
import pasajero.identities.IdPasajero;
import pasajero.values.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CheckInUseCaseTest {
     @InjectMocks
     private CheckInUseCase checkInUseCase;

     @Mock
     private DomainEventRepository repository;

     @Test
     void CheckInUseCaseTest(){

         var idPasajero= IdPasajero.of("xx");
         var idEquipaje=new IdEquipaje("eq");
         var peso=new Peso(100D);
         var volumen=new Volumen(10D);
         var tipo=new Tipo("delicado");
         var descripcion=new Descripcion("reliquia");
         var numeroAsiento=new NumeroAsiento(12);
         var idAsiento=IdAsiento.of("asi");
         var event=new Checked(idPasajero,idEquipaje,peso,volumen,tipo,descripcion,numeroAsiento,idAsiento);
         when(repository.getEventsBy("xx")).thenReturn(history());
         checkInUseCase.addRepository(repository);

         var events = UseCaseHandler.getInstance()
                 .syncExecutor(checkInUseCase, new TriggeredEvent<>(event))
                 .orElseThrow()
                 .getDomainEvents();

         var checked= (Checked)events.get(0);
         Assertions.assertEquals(idPasajero,checked.getIdPasajero());
         Assertions.assertEquals(descripcion,checked.getDescripcion());
         Assertions.assertEquals(idAsiento,checked.getIdAsiento());
         verify(repository).getEventsBy("xx");

     }

    private List<DomainEvent> history() {
        Nombre nombre=new Nombre("pepe");
        Telefono telefono=new Telefono("111");
        Correo correo=new Correo("qq@g.com");
        DatosPersonales datosPersonales=new DatosPersonales(nombre,telefono,correo);
        var pasajeroCreado =new PasajeroCreado(datosPersonales);
        pasajeroCreado.setAggregateName("pasajero");
        return List.of(pasajeroCreado);
    }


}