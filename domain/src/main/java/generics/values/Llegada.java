package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Llegada implements ValueObject<String> {
    private String valor;

    public Llegada(String valor) {
        this.valor = valor;
    }

    @Override
    public String value() {
        return valor;
    }
}
