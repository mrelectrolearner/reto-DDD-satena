package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

public class Numero implements ValueObject<Integer> {
    private Integer valor;

    public Numero(Integer valor) {
        this.valor = valor;
    }

    @Override
    public Integer value() {
        return valor;
    }
}
