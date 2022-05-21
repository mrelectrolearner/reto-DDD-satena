package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroAsiento implements ValueObject<Integer> {
    private static Integer numeroMaximoAsientos=30;
    private Integer valor;

    public NumeroAsiento(Integer valor) {
        this.valor = Objects.requireNonNull(valor);
        if(this.valor>numeroMaximoAsientos||this.valor<0){
            throw new IllegalArgumentException("No existe ese numero de asiento");
        }


    }

    @Override
    public Integer value() {
        return valor;
    }
}
