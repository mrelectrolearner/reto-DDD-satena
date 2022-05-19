package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tarifa implements ValueObject<Double> {
    private Double costo;

    @Override
    public Double value() {
        return costo;
    }
}
