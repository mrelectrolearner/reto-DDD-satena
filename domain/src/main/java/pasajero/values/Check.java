package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Check implements ValueObject<Boolean> {
    protected Boolean check;

    @Override
    public Boolean value() {
        return check;
    }
}
