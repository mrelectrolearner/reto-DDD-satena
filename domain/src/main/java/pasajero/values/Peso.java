package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Peso implements ValueObject<Double> {
    private Double peso;

    public Peso(Double peso) {
        this.peso = peso;
    }

    @Override
    public Double value() {
        return peso;
    }
}
