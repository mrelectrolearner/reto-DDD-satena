package vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Capacidad implements ValueObject<Double> {

    private Double valor;

    public Capacidad(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double value() {
        return valor;
    }
}
