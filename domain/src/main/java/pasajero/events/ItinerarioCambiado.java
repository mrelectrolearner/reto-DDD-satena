package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;

public class ItinerarioCambiado extends DomainEvent {

    private final Itinerario itinerarioNuevo;
    public ItinerarioCambiado(Itinerario itinerarioNuevo) {
        super("pasajero.ItinerarioCambiado");

        this.itinerarioNuevo = itinerarioNuevo;
    }

    public Itinerario getItinerarioNuevo() {
        return itinerarioNuevo;
    }
}
