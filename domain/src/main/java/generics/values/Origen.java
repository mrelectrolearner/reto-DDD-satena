package generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Origen implements ValueObject<String> {
    private String  origen;

    public Origen(String origen) {
        this.origen = Objects.requireNonNull(origen);
    }

    @Override
    public String value() {
        return origen;
    }
}
