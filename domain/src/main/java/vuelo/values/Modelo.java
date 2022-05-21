package vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelo implements ValueObject<String> {
    private String modelo;

    public Modelo(String modelo) {
        this.modelo = Objects.requireNonNull(modelo);
    }

    @Override
    public String value() {
        return modelo;
    }
}
