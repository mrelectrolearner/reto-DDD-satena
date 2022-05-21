package vuelo.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.values.Descripcion;
import pasajero.values.Peso;
import pasajero.values.Volumen;
import vuelo.identities.IdCarga;

public class Carga extends Entity<IdCarga> {
    protected Peso peso;
    protected Volumen volumen;
    protected Descripcion descripcion;

    public Carga(IdCarga entityId) {
        super(entityId);
    }

}
