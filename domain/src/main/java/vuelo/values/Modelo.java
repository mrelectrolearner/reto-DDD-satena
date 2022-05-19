package vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Modelo implements ValueObject<String> {
    private String modelo;

    public Modelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String value() {
        return modelo;
    }
}
