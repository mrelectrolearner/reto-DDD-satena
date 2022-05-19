package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdAsiento;
import pasajero.values.EstadoAsiento;
import pasajero.values.Numero;

public class Asiento extends Entity<IdAsiento> {
    protected Numero numero;
    protected EstadoAsiento estado;

    public Asiento(IdAsiento entityId, Numero numero) {
        super(entityId);
        this.numero=numero;
        this.estado=new EstadoAsiento(EstadoAsiento.Estado.DISPONIBLE);
    }

    public Numero getNumero() {
        return numero;
    }

    public EstadoAsiento getEstado() {
        return estado;
    }
}
