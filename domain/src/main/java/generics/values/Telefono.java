package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Telefono implements ValueObject<String> {
    private String valor;

    public Telefono(String valor) {
        this.valor = valor;
    }

    @Override
    public String value() {
        return valor;
    }
}
