package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroTicket implements ValueObject<Long> {
    private Long value;

    public NumeroTicket(Long value) {
        this.value = value;
    }

    @Override
    public Long value() {
        return value;
    }
}
