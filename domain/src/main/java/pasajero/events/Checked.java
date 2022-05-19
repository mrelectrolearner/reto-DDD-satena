package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.identities.IdAsiento;
import pasajero.values.*;

public class Checked extends DomainEvent {
    private final Peso peso;
    private final Volumen volumen;
    private final Tipo tipo;
    private final Descripcion descripcion;
    private final NumeroAsiento numeroAsiento;
    private final IdAsiento idAsiento;
    public Checked(Peso peso, Volumen volumen, Tipo tipo, Descripcion descripcion, NumeroAsiento asiento, IdAsiento idAsiento) {
        super("Checked");
        this.volumen = volumen;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.peso=peso;
        this.numeroAsiento=asiento;
        this.idAsiento = idAsiento;
    }

    public Peso getPeso() {
        return peso;
    }

    public Volumen getVolumen() {
        return volumen;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public NumeroAsiento getNumeroAsiento() {
        return numeroAsiento;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
