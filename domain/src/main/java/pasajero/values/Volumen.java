package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Volumen implements ValueObject<Double> {
    private Double valor;

    @Override
    public Double value() {
        return valor;
    }
}
