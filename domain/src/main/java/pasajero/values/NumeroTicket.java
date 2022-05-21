package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroTicket implements ValueObject<Long> {
    private Long value;

    public NumeroTicket(Long value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Long value() {
        return value;
    }
}
