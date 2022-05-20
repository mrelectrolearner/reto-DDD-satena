package vuelo.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.*;

public class VueloCreado extends DomainEvent {

    private final Itinerario itinerario;

    public VueloCreado(Itinerario itinerario) {
        super("vuelo.VueloCreado");
        this.itinerario = itinerario;
    }

    public VueloCreado() {
        super("vuelo.VueloCreado");
        this.itinerario=null;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }
}
