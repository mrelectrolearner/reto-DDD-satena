package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Numero implements ValueObject<Integer> {
    private Integer valor;

    @Override
    public Integer value() {
        return valor;
    }
}
