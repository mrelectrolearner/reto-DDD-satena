package generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Destino implements ValueObject<String> {
    private String destino;

    public Destino(String destino) {
        this.destino = Objects.requireNonNull(destino);
    }

    @Override
    public String value() {
        return destino;
    }
}
