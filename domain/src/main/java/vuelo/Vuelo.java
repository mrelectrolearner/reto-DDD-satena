package vuelo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import generics.values.*;
import pasajero.identities.IdPasajero;
import tripulacion.identities.IdTripulacion;
import vuelo.entities.Avion;
import vuelo.entities.Carga;
import vuelo.entities.Ruta;
import vuelo.events.AvionAgregado;
import vuelo.events.VueloCreado;
import vuelo.identities.IdAvion;
import vuelo.identities.IdVuelo;
import vuelo.values.Capacidad;
import vuelo.values.Modelo;

import java.util.List;
import java.util.Set;

public class Vuelo extends AggregateEvent<IdVuelo> {
    protected IdTripulacion idTripulacion;
    protected Avion avion;
    protected Set<IdPasajero> idPasajeros;
    protected Ruta ruta;

    protected Carga carga;

    public Vuelo(IdVuelo entityId) {
        super(entityId);
    }

    public Vuelo(IdVuelo entityId, Itinerario itinerario) {
        super(entityId);
        appendChange(new VueloCreado( itinerario)).apply();
        subscribe(new VueloEventChange(this));
    }

    public static Vuelo from(IdVuelo idVuelo, List<DomainEvent> events){
        var vuelo= new Vuelo(idVuelo);
        events.forEach(vuelo::applyEvent);
        return vuelo;
    }

    public void agregarAvion(IdAvion idAvion, Modelo modelo, Capacidad capacidad){
        appendChange(new AvionAgregado(idAvion, modelo,capacidad )).apply();
    }
    /*
    public void agregarPasajero(IdPasajero idPasajero)
    {
        appendChange(new PasajeroAgregado(idPasajero)).apply();
    }

    public void eliminarPasajero(IdPasajero idPasajero) {
        appendChange(new PasajeroEliminado(idPasajero)).apply();
    }

    public void cambiarRuta(CodigoVuelo codigoVuelo){
        appendChange(new CodigoVueloRutaCambiado(codigoVuelo)).apply();
    }

    public void cambiarRuta(Fecha fecha){
        appendChange(new FechaRutaCambiada(fecha)).apply();
    }

    public void cambiarRuta(Salida salida){
        appendChange(new SalidaRutaCambiada(salida)).apply();
    }

    public void cambiarRuta(Origen origen){
        appendChange(new OrigenRutaCambiado(origen)).apply();
    }

    public void cambiarRuta(Destino destino){
        appendChange(new DestinoRutaCambiada(destino)).apply();
    }

    public void cambiarRuta(Llegada llegada){
        appendChange(new LlegadaRutaCambiada(llegada)).apply();
    }

    public void agregarTripulacion(IdPiloto idPiloto){
        appendChange(new PilotoAgregadoDeVuelo(idPiloto)).apply();

    }

    public void agregarTripulacion(IdCopiloto idCopiloto){
        appendChange(new CopilotoAgregadoDeVuelo(idCopiloto)).apply();

    }

    public void agregarTripulacion(IdSobrecargo idSobrecargo){
        appendChange(new SobrecargoAgregadoDeVuelo(idSobrecargo)).apply();
    }


    public void elimnarSobrecargo(IdSobrecargo idSobrecargo){
        appendChange(new SobrecargoEliminadoDeVuelo(idSobrecargo)).apply();
    }

    public void modificarUbicacionAvion(IdRuta idRuta, Ubicacion ubicacion){
        appendChange(new UbicacionAvionModificada(idRuta,ubicacion)).apply();
    }

*/

}

