package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroAsiento implements ValueObject<Integer> {
    private Integer valor;

    public NumeroAsiento(Integer valor) {
        this.valor = valor;
    }

    @Override
    public Integer value() {
        return valor;
    }
}
