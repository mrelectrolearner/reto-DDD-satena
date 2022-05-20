package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import pasajero.identities.IdReserva;
import pasajero.values.Tarifa;

public class VueloReservado extends DomainEvent {
    private final Itinerario itinerario;
    private final Tarifa tarifa;
    private final IdReserva idReserva;
    public VueloReservado(IdReserva idReserva,Itinerario itinerario, Tarifa tarifa ) {
        super("pasajero.VueloReservado");
        this.itinerario=itinerario;
        this.tarifa=tarifa;
        this.idReserva = idReserva;
    }

    public IdReserva getIdReserva() {
        return idReserva;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
}
