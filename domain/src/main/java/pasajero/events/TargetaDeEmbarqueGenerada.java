package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.entities.Asiento;
import pasajero.values.Numero;
import pasajero.values.NumeroTicket;
import vuelo.Vuelo;
import vuelo.identities.IdVuelo;

public class TargetaDeEmbarqueGenerada extends DomainEvent {
    private final Nombre nombre;
    private final NumeroTicket numeroTicket;
    private final Numero numero;
    private final IdVuelo idVuelo;
    private final Itinerario itinerario;
    public TargetaDeEmbarqueGenerada(Nombre nombre, IdVuelo idvuelo, Itinerario itinerario, NumeroTicket numeroTicket, Numero asiento) {
        super("TargetaDeEmbarqueGenerada");
        this.nombre=nombre;
        this.numeroTicket=numeroTicket;
        this.numero =asiento;
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

    public Numero getNumero() {
        return numero;
    }
}
