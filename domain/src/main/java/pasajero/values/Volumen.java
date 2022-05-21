package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Volumen implements ValueObject<Double> {
    private Double valor;

    public Volumen(Double valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Double value() {
        return valor;
    }
}
