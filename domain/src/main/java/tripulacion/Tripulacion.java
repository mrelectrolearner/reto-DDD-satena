package tripulacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;
import generics.values.Fecha;
import tripulacion.entities.Copiloto;
import tripulacion.entities.Piloto;
import tripulacion.entities.Sobrecargo;
import tripulacion.events.*;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdSobrecargo;
import tripulacion.identities.IdTripulacion;

import java.util.List;
import java.util.Map;


public class Tripulacion extends AggregateEvent<IdTripulacion> {
    protected Piloto piloto;
    protected Copiloto copiloto;
    protected Map<IdSobrecargo,Sobrecargo> sobrecargos;

    public Tripulacion(IdTripulacion entityId, DatosPersonales datosPiloto,
                       IdPiloto idPiloto) {
        super(entityId);
        appendChange(new TripulacionCreada(idPiloto,datosPiloto)).apply();
        subscribe(new TripulacionEventChange(this));
    }

    public Tripulacion(IdTripulacion idTripulacion) {
        super(idTripulacion);
    }

    public static Tripulacion from(IdTripulacion idTripulacion, List<DomainEvent> events){
        var tripulacion = new Tripulacion(idTripulacion);
        events.forEach(tripulacion::applyEvent);
        return tripulacion;
    }

    public void modificarPiloto(DatosPersonales datosPiloto){
        appendChange(new PilotoModificado(datosPiloto)).apply();
    }

    public void cambiarCopiloto(DatosPersonales datosCopiloto){
        appendChange(new CopilotoCambiado(datosCopiloto)).apply();
    }

    public void agregarSobrecargo(IdSobrecargo idSobrecargo, DatosPersonales datosPersonales){
        appendChange(new SobrecargoAgregado(idSobrecargo,datosPersonales)).apply();
    }

    public void elimnarSobrecargo(IdSobrecargo idSobrecargo){
        appendChange(new SobrecargoEliminado(idSobrecargo)).apply();
    }

    public void agregarVuelo(IdPiloto idPiloto, Fecha fecha){
        appendChange(new VueloAgregadoPiloto(idPiloto,fecha)).apply();
    }

    public void agregarVuelo(IdCopiloto idCopiloto, Fecha fecha){
        appendChange(new VueloAgregadoCopiloto(idCopiloto,fecha)).apply();
    }

    public void agregarVuelo(IdSobrecargo idSobrecargo, Fecha fecha){
        appendChange(new VueloAgregadoSobrecargo(idSobrecargo,fecha)).apply();
    }







}
