package pasajero.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import generics.values.Correo;
import generics.values.DatosPersonales;
import generics.values.Nombre;
import generics.values.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pasajero.commands.CrearPasajero;
import pasajero.events.PasajeroCreado;

class CrearPasajeroUseCaseTest {
    private CrearPasajeroUseCase crearPasajeroUseCase;
    @BeforeEach
    private void setup(){
        crearPasajeroUseCase=new CrearPasajeroUseCase();
    }

    @Test
    public void crearPasajeroHappyPass(){
        //arrange
        var idPasajero= pasajero.identities.IdPasajero.of("xxx");
        var nombre=new Nombre("lyyy");
        var telefono=new Telefono("1111");
        var correo=new Correo("p@gp.com");
        var datosPasajero=new DatosPersonales( nombre,telefono,correo);
        var command=new CrearPasajero(idPasajero,datosPasajero);

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(crearPasajeroUseCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var pasajeroCreado =(PasajeroCreado)events.get(0);
        Assertions.assertEquals(datosPasajero, pasajeroCreado.getDatosPersonales());
        Assertions.assertEquals("xxx",pasajeroCreado.aggregateRootId());


    }

}