package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.PrimitiveIterator;

public class EstadoAsiento implements ValueObject<EstadoAsiento.Estado> {
    private Estado valor;

    @Override
    public Estado value() {
        return valor;
    }

    public enum Estado{
        DISPONIBLE, NODISPONIBLE
    }
}
