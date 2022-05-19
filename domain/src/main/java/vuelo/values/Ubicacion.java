package vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Ubicacion implements ValueObject<String> {
    private String ubicacion;

    @Override
    public String value() {
        return ubicacion;
    }
}
