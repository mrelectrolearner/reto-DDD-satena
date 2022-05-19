package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;

public class ItinerarioCambiado extends DomainEvent {
    private final Itinerario actual;
    private final Itinerario nuevo;
    public ItinerarioCambiado(Itinerario itinerarioActual, Itinerario itinerarioNuevo) {
        super("ItinerarioCambiado");
        this.actual = itinerarioActual;
        this.nuevo = itinerarioNuevo;
    }

    public Itinerario getActual() {
        return actual;
    }

    public Itinerario getNuevo() {
        return nuevo;
    }
}
