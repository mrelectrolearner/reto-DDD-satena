package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdAsiento;
import pasajero.values.EstadoAsiento;
import pasajero.values.Numero;

public class Asiento extends Entity<IdAsiento> {
    protected Numero numero;
    protected EstadoAsiento estado;

    public Asiento(IdAsiento entityId) {
        super(entityId);
    }
}
