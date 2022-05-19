package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdAsiento;
import pasajero.values.EstadoAsiento;
import pasajero.values.NumeroAsiento;

public class Asiento extends Entity<IdAsiento> {
    protected NumeroAsiento numeroAsiento;
    protected EstadoAsiento estado;

    public Asiento(IdAsiento entityId, NumeroAsiento numeroAsiento) {
        super(entityId);
        this.numeroAsiento = numeroAsiento;
        this.estado=new EstadoAsiento(EstadoAsiento.Estado.DISPONIBLE);
    }

    public NumeroAsiento getNumero() {
        return numeroAsiento;
    }

    public EstadoAsiento getEstado() {
        return estado;
    }
}
