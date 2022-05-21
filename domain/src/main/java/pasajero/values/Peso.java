package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Peso implements ValueObject<Double> {
    private Double peso;

    public Peso(Double peso) {
        this.peso = Objects.requireNonNull(peso);

    }

    @Override
    public Double value() {
        return peso;
    }
}
