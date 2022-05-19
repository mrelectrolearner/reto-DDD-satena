package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.values.NumeroAsiento;
import pasajero.values.NumeroTicket;
import vuelo.identities.IdVuelo;

public class TargetaDeEmbarqueGenerada extends DomainEvent {
    private final Nombre nombre;
    private final NumeroTicket numeroTicket;
    private final NumeroAsiento numeroAsiento;
    private final IdVuelo idVuelo;
    private final Itinerario itinerario;
    public TargetaDeEmbarqueGenerada(Nombre nombre, IdVuelo idvuelo, Itinerario itinerario, NumeroTicket numeroTicket, NumeroAsiento asiento) {
        super("TargetaDeEmbarqueGenerada");
        this.nombre=nombre;
        this.numeroTicket=numeroTicket;
        this.numeroAsiento =asiento;
        this.idVuelo=idvuelo;
        this.itinerario=itinerario;

    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public IdVuelo getVuelo() {
        return idVuelo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroTicket getNumeroTicket() {
        return numeroTicket;
    }

    public NumeroAsiento getNumero() {
        return numeroAsiento;
    }
}
