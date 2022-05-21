package generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Llegada implements ValueObject<String> {
    private String valor;

    public Llegada(String valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public String value() {
        return valor;
    }
}
