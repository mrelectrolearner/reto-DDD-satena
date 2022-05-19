package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Peso implements ValueObject<Double> {
    private Double peso;

    @Override
    public Double value() {
        return peso;
    }
}
