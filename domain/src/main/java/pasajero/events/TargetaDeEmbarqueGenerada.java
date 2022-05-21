package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.identities.IdPasajero;
import pasajero.values.NumeroAsiento;
import pasajero.values.NumeroTicket;
import vuelo.identities.IdVuelo;

public class TargetaDeEmbarqueGenerada extends DomainEvent {
    private final IdPasajero idPasajero;
    private final Nombre nombre;
    private final NumeroTicket numeroTicket;
    private final NumeroAsiento numeroAsiento;
    private final IdVuelo idVuelo;
    private final Itinerario itinerario;
    public TargetaDeEmbarqueGenerada(IdPasajero idPasajero, Nombre nombre, IdVuelo idvuelo, Itinerario itinerario, NumeroTicket numeroTicket, NumeroAsiento asiento) {
        super("pasajero.TargetaDeEmbarqueGenerada");
        this.idPasajero = idPasajero;
        this.nombre=nombre;
        this.numeroTicket=numeroTicket;
        this.numeroAsiento =asiento;
        this.idVuelo=idvuelo;
        this.itinerario=itinerario;

    }

    public IdPasajero getIdPasajero() {
        return idPasajero;
    }

    public NumeroAsiento getNumeroAsiento() {
        return numeroAsiento;
    }

    public IdVuelo getIdVuelo() {
        return idVuelo;
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

}
