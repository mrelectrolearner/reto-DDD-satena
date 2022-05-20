package tripulacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class Disponibilidad implements ValueObject<Disponibilidad.EstadoTripulante> {
    private EstadoTripulante valor;

    public Disponibilidad(EstadoTripulante disponible) {
        this.valor=disponible;
    }

    @Override
    public EstadoTripulante value() {
        return valor;
    }

    public enum EstadoTripulante{
        DISPONIBLE, NODISPONIBLE
    }
}
