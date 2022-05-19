package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Origen implements ValueObject<String> {
    private String origen;

    @Override
    public String value() {
        return origen;
    }
}