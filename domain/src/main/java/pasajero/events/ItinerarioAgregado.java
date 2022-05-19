package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;

public class ItinerarioAgregado extends DomainEvent {
    private final Itinerario itinerario;
    public ItinerarioAgregado(Itinerario itinerario) {
        super("ItinerarioAgregado");
        this.itinerario=itinerario;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }
}
