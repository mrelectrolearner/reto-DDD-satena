package vuelo;

import co.com.sofka.domain.generic.AggregateEvent;
import pasajero.Pasajero;
import tripulacion.identities.IdTripulacion;
import vuelo.entities.Avion;
import vuelo.entities.Ruta;
import vuelo.identities.IdVuelo;

import java.util.Set;

public class Vuelo extends AggregateEvent<IdVuelo> {
    protected IdTripulacion idTripulacion;
    protected Avion avion;
    protected Set<Pasajero> pasajeros;
    protected Ruta ruta;



    public Vuelo(IdVuelo entityId) {
        super(entityId);
    }
}
