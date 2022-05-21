package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Check implements ValueObject<Boolean> {
    protected Boolean check;

    public Check(Boolean check) {
        this.check = Objects.requireNonNull( check);

    }

    @Override
    public Boolean value() {
        return check;
    }

}
