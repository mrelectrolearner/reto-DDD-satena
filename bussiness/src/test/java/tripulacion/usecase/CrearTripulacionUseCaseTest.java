package tripulacion.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import generics.values.Correo;
import generics.values.DatosPersonales;
import generics.values.Nombre;
import generics.values.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tripulacion.commands.CrearTripulacion;
import tripulacion.events.TripulacionCreada;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdTripulacion;

class CrearTripulacionUseCaseTest {
    private CrearTripulacionUseCase crearTripulacionUseCase;

    @BeforeEach
    public void setup(){
        crearTripulacionUseCase=new CrearTripulacionUseCase();
    }

    @Test
    void CrearTripulacionUseCaseHappy(){
        //arrange
        var idTripulacion=IdTripulacion.of("xx");
        var idPiloto=IdPiloto.of("pilo");
        var nombre=new Nombre("l");
        var telefono=new Telefono("1111");
        var correo=new Correo("p@gp.com");
        var datosPersonales=new DatosPersonales( nombre,telefono,correo);
        var command=new CrearTripulacion(idTripulacion,idPiloto,datosPersonales);

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(crearTripulacionUseCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var tripulacionCreada=(TripulacionCreada) events.get(0);
        //assertion
        Assertions.assertEquals(idTripulacion.toString(),tripulacionCreada.aggregateRootId());
        Assertions.assertEquals(datosPersonales,tripulacionCreada.getDatosPiloto());
        Assertions.assertEquals(idPiloto,tripulacionCreada.getIdPiloto());
    }

}