package pasajero.usecase;

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
import pasajero.commands.CambiarAsiento;
import pasajero.events.AsientoCambiado;
import pasajero.events.PasajeroCreado;
import pasajero.identities.IdPasajero;
import pasajero.values.NumeroAsiento;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CambiarAsientoUseCaseTest {

    @InjectMocks
    private CambiarAsientoUseCase cambiarAsientoUseCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void cambiarAsientoUseCaseHappytest(){
        //arrange
        var numeroAsiento=new NumeroAsiento(1);
        var IdAsiento= pasajero.identities.IdAsiento.of("xxx");
        var idPasajero=IdPasajero.of("xx");
        var command=new CambiarAsiento(numeroAsiento, IdAsiento, idPasajero);
        when(repository.getEventsBy("xx")).thenReturn(history());
        cambiarAsientoUseCase.addRepository(repository);

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(cambiarAsientoUseCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var asientoCambiado=(AsientoCambiado) events.get(0);

        //assert
        Assertions.assertEquals(numeroAsiento, asientoCambiado.getNumeroAsientoNuevo());


    }

    private List<DomainEvent> history() {
        Nombre nombre=new Nombre("pepe");
        Telefono telefono=new Telefono("111");
        Correo correo=new Correo("qq@g.com");
        DatosPersonales datosPersonales=new DatosPersonales(nombre,telefono,correo);
        var pasajeroCreado =new PasajeroCreado(datosPersonales);
        pasajeroCreado.setAggregateRootId("xx");
        return List.of(pasajeroCreado);
    }

}