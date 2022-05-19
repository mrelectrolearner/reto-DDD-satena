package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.entities.Asiento;
import pasajero.values.NumeroTicket;
import vuelo.Vuelo;

public class TargetaDeEmbarqueGenerada extends DomainEvent {
    private final Nombre nombre;
    private final NumeroTicket numeroTicket;
    private final Asiento asiento;
    private final Vuelo vuelo;
    private final Itinerario itinerario;
    public TargetaDeEmbarqueGenerada(Nombre nombre, Vuelo vuelo, Itinerario itinerario, NumeroTicket numeroTicket, Asiento asiento) {
        super("TargetaDeEmbarqueGenerada");
        this.nombre=nombre;
        this.numeroTicket=numeroTicket;
        this.asiento=asiento;
        this.vuelo=vuelo;
        this.itinerario=itinerario;

    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public Vuelo getVuelo() {
        return vuelo;
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
