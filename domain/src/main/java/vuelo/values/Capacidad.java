package vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Capacidad implements ValueObject<Double> {

    private Double valor;

    public Capacidad(Double valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Double value() {
        return valor;
    }
}
