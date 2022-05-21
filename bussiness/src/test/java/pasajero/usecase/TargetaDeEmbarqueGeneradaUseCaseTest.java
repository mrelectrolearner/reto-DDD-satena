package pasajero.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import generics.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pasajero.events.*;
import pasajero.identities.IdAsiento;
import pasajero.identities.IdEquipaje;
import pasajero.identities.IdPasajero;
import pasajero.identities.IdReserva;
import pasajero.values.*;
import vuelo.identities.IdVuelo;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TargetaDeEmbarqueGeneradaUseCaseTest {
    @InjectMocks
    private TargetaDeEmbarqueGeneradaUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void targetaDeEmbarqueGeneradaUseCaseHappyTest(){
        var idPasajero=IdPasajero.of("pas");
        var nombre=new Nombre("fel");
        var idVuelo=IdVuelo.of("vuel");
        CodigoVuelo codigovuelo=new CodigoVuelo("sd");
        Fecha fecha=new Fecha(LocalDate.now());
        Salida salida=new Salida("cali");
        Origen origen=new Origen("medellin");
        Destino destino=new Destino("8:00");
        Llegada llegada=new Llegada("9:00");
        var itinerario=new Itinerario(codigovuelo,fecha,salida,origen,destino,llegada);
        var numeroTicket=new NumeroTicket(1L);
        var numeroAsieno=new NumeroAsiento(12);

        var event=new TargetaDeEmbarqueGenerada(
                idPasajero,
                nombre,
                idVuelo,
                itinerario,
                numeroTicket,
                numeroAsieno
        );

        when(repository.getEventsBy("pas")).thenReturn(history());
        useCase.addRepository(repository);


        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        var targetaDeEmbarqueGenerada=(TargetaDeEmbarqueGenerada)events.get(0);

        Assertions.assertEquals(idPasajero,targetaDeEmbarqueGenerada.getIdPasajero());
        Assertions.assertEquals(nombre.value(),targetaDeEmbarqueGenerada.getNombre().value());
        Assertions.assertEquals(numeroAsieno.value(),targetaDeEmbarqueGenerada.getNumeroAsiento().value());
        verify(repository).getEventsBy("pas");

    }

    private List<DomainEvent> history() {
        Nombre nombre=new Nombre("fel");
        Telefono telefono=new Telefono("111");
        Correo correo=new Correo("qq@g.com");
        DatosPersonales datosPersonales=new DatosPersonales(nombre,telefono,correo);
        var fecha=new Fecha(LocalDate.now());
        CodigoVuelo codigoVuelo=new CodigoVuelo("sd");
        Salida salida=new Salida("cali");
        Origen origen=new Origen("medellin");
        Destino destino=new Destino("8:00");
        Llegada llegada=new Llegada("9:00");
        var itinerario=new Itinerario(codigoVuelo,fecha,salida,origen,destino,llegada);
        var pasajeroCreado =new PasajeroCreado(datosPersonales);
        var idPasajero= IdPasajero.of("pas");
        var idEquipaje=new IdEquipaje("eq");
        var peso=new Peso(100D);
        var volumen=new Volumen(10D);
        var tipo=new Tipo("delicado");
        var descripcion=new Descripcion("reliquia");
        var numeroAsiento=new NumeroAsiento(12);
        var idAsiento=IdAsiento.of("asi");
        pasajeroCreado.setAggregateRootId("pas");
        var reservado=new VueloReservado(
                new IdReserva("ress"),
                itinerario,
                new Tarifa(10D)
                );
        reservado.setAggregateRootId("pas");
        var checked=new Checked(
                idPasajero,
                idEquipaje,
                peso,
                volumen,
                tipo,
                descripcion,
                numeroAsiento,
                idAsiento);


        return List.of(pasajeroCreado,reservado,checked);
    }

}