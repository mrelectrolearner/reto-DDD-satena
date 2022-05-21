package generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CodigoVuelo implements ValueObject<String> {
    private String valor;

    public CodigoVuelo(String valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public String value() {
        return null;
    }
}
