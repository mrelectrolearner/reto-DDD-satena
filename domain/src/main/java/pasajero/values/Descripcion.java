package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {
    private String valor;

    public Descripcion(String valor) {
        this.valor = Objects.requireNonNull(valor);
        if(this.valor.isBlank()){
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }

        if(this.valor.length() > 200){
            throw new IllegalArgumentException("La descripcion no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return valor;
    }
}
