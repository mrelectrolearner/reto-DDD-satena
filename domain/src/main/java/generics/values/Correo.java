package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Correo implements ValueObject<String> {
    private String valor;

    @Override
    public String value() {
        return valor;
    }
}
