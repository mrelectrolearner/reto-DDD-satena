package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class EstadoReserva implements ValueObject<EstadoReserva.Estado> {
    private Estado estado;

    public EstadoReserva(Estado estado) {
        this.estado = estado;
    }

    @Override
    public Estado value() {
        return estado;
    }


    public enum Estado{
        ACTIVA,NOACTIVA
    }
}
