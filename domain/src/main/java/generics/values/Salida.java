package generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Salida implements ValueObject<String> {
    private String valor;

    public Salida(String valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public String value() {
        return valor;
    }
}
