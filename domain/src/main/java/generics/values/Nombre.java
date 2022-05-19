package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
    private String value;

    @Override
    public String value() {
        return value;
    }
}
