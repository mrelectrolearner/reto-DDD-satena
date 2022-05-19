package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;

public class ItinerarioEliminado extends DomainEvent {
    private final Itinerario itinerario;
    public ItinerarioEliminado(Itinerario itinerario) {
        super("ItinerarioEliminado");
        this.itinerario=itinerario;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }
}
