package vuelo.entities;

import co.com.sofka.domain.generic.Entity;
import generics.values.Itinerario;
import vuelo.identities.IdRuta;
import vuelo.values.Ubicacion;


public class Ruta extends Entity<IdRuta> {
    protected Itinerario itinerario;
    protected Ubicacion ubicacionActual;

    public Ruta(IdRuta entityId) {
        super(entityId);
    }
}
