package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Destino implements ValueObject<String> {
    private String destino;

    public Destino(String destino) {
        this.destino = destino;
    }

    @Override
    public String value() {
        return destino;
    }
}
