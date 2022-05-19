package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class EstadoReserva implements ValueObject<EstadoReserva.Estado> {
    private Estado estado;

    @Override
    public Estado value() {
        return estado;
    }


    public enum Estado{
        ACTIVA,NOACTIVA
    }
}
