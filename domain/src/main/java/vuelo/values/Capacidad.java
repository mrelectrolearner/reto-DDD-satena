package vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Capacidad implements ValueObject<Capacidad.Pros> {

    private Double maximaCarga;
    private Integer maximoNumeroDePasajeros;
    private Double maximoHorasDeVuelo;

    @Override
    public Pros value() {
        return null;
    }

    public interface Pros {


    }
}
