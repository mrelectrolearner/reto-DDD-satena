package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tarifa implements ValueObject<Double> {
    private Double costo;

    public Tarifa(Double costo) {
        this.costo = Objects.requireNonNull(costo);
    }

    @Override
    public Double value() {
        return costo;
    }
}
