package vuelo.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import generics.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Or;
import pasajero.events.PasajeroCreado;
import vuelo.commands.CrearVuelo;
import vuelo.events.VueloCreado;
import vuelo.identities.IdVuelo;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CrearVueloUseCaseTest {
    private CrearVueloUseCase crearVueloUseCase;

    @BeforeEach
    private void setup(){
        crearVueloUseCase=new CrearVueloUseCase();
    }

    @Test
    void CrearVueloUseCaseHappytest(){
        //arrange
        var idVuelo=IdVuelo.of("ss");
        var fecha=new Fecha(LocalDate.now());
        var salida=new Salida("marte");
        var origen=new Origen("tierra");
        var destino=new Destino("luna");
        var llegada=new Llegada("mercurio");
        var codigoVuelo=new CodigoVuelo("ss");
        var itinerario=new Itinerario(codigoVuelo,fecha,salida,origen,destino,llegada);
        var command= new CrearVuelo(idVuelo, itinerario);

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(crearVueloUseCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var vueloCreado =(VueloCreado)events.get(0);
        Assertions.assertEquals(idVuelo.toString(),vueloCreado.aggregateRootId());
        Assertions.assertEquals(itinerario,vueloCreado.getItinerario());

    }

}