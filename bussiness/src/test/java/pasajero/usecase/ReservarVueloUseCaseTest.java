package pasajero.usecase;

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
import pasajero.commands.ReservarVuelo;
import pasajero.events.PasajeroCreado;
import pasajero.events.VueloReservado;
import pasajero.identities.IdPasajero;
import pasajero.identities.IdReserva;
import pasajero.values.Tarifa;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ReservarVueloUseCaseTest {
    @InjectMocks
    private ReservarVueloUseCase reservarVueloUseCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void happyReservaVueloUseCase(){
        //arrange
        CodigoVuelo codigovuelo=new CodigoVuelo("sd");
        Fecha fecha=new Fecha(LocalDate.now());
        Salida salida=new Salida("cali");
        Origen origen=new Origen("medellin");
        Destino destino=new Destino("8:00");
        Llegada llegada=new Llegada("9:00");
        var itinerario=new Itinerario(codigovuelo,fecha,salida,origen,destino,llegada);
        var tarifa=new Tarifa(1D);
        var idReserva=IdReserva.of("reserva");
        var idPasajero=IdPasajero.of("xix");
        var command= new ReservarVuelo(itinerario,tarifa,idReserva,idPasajero);
        when(repository.getEventsBy("xix")).thenReturn(history());
        reservarVueloUseCase.addRepository(repository);

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(reservarVueloUseCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var vueloReservado=(VueloReservado)events.get(0);

        //assert
        Assertions.assertEquals("reserva",vueloReservado.getIdReserva().value());
        Assertions.assertEquals(itinerario,vueloReservado.getItinerario());
        Assertions.assertEquals(tarifa,vueloReservado.getTarifa());
        Mockito.verify(repository).getEventsBy("xix");

    }

    private List<DomainEvent> history() {

        Nombre nombre=new Nombre("pepe");
        Telefono telefono=new Telefono("111");
        Correo correo=new Correo("qq@g.com");
        DatosPersonales datosPersonales=new DatosPersonales(nombre,telefono,correo);
        var pasajeroCreado =new PasajeroCreado(datosPersonales);
        pasajeroCreado.setAggregateRootId("xix");
        return List.of(pasajeroCreado);
    }


}