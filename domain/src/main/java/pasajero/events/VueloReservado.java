package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import pasajero.values.Tarifa;

public class VueloReservado extends DomainEvent {
    private final Itinerario itinerario;
    private final Tarifa tarifa;
    public VueloReservado(Itinerario itinerario, Tarifa tarifa) {
        super("VueloReservado");
        this.itinerario=itinerario;
        this.tarifa=tarifa;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
}
