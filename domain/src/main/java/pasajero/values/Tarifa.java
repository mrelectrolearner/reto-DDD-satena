package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tarifa implements ValueObject<Double> {
    private Double costo;

    public Tarifa(Double costo) {
        this.costo = costo;
    }

    @Override
    public Double value() {
        return costo;
    }
}
