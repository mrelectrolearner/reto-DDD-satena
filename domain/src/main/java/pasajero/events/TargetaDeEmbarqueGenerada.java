package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Nombre;
import pasajero.entities.Asiento;
import pasajero.values.NumeroTicket;

public class TargetaDeEmbarqueGenerada extends DomainEvent {
    private final Nombre nombre;
    private final NumeroTicket numeroTicket;
    private final Asiento asiento;
    public TargetaDeEmbarqueGenerada(Nombre nombre, NumeroTicket numeroTicket, Asiento asiento) {
        super("TargetaDeEmbarqueGenerada");
        this.nombre=nombre;
        this.numeroTicket=numeroTicket;
        this.asiento=asiento;

    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroTicket getNumeroTicket() {
        return numeroTicket;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}
