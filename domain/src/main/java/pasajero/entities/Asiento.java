package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdAsiento;
import pasajero.values.EstadoAsiento;
import pasajero.values.NumeroAsiento;

public class Asiento extends Entity<IdAsiento> {
    protected NumeroAsiento numeroAsiento;
    protected EstadoAsiento estado;

    public Asiento(IdAsiento entityId) {
        super(entityId);
        this.estado=new EstadoAsiento(EstadoAsiento.Estado.NODISPONIBLE);
    }

    public void assignarNumeroAsiento(NumeroAsiento numeroAsiento){
        this.numeroAsiento=numeroAsiento;

    }
    public void cambiarEstado(EstadoAsiento estado){
        this.estado=estado;

    }


    public NumeroAsiento getNumero() {
        return numeroAsiento;
    }

    public EstadoAsiento getEstado() {
        return estado;
    }
}
