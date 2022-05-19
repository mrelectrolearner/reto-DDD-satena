package vuelo.entities;

import co.com.sofka.domain.generic.Entity;
import vuelo.identities.IdAvion;
import vuelo.values.Capacidad;
import vuelo.values.Modelo;

public class Avion extends Entity<IdAvion> {
    protected Modelo modelo;
    protected Capacidad capacidad;

    public Avion(IdAvion entityId) {
        super(entityId);
    }
}
