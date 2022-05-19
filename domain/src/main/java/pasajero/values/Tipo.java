package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tipo implements ValueObject<String> {
    private String valor;

    public Tipo(String valor) {
        this.valor = valor;
    }

    @Override
    public String value() {
        return valor;
    }
}
