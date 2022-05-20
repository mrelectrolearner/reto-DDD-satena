package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class CodigoVuelo implements ValueObject<String> {
    private String valor;

    public CodigoVuelo(String valor) {
        this.valor = valor;
    }

    @Override
    public String value() {
        return null;
    }
}
