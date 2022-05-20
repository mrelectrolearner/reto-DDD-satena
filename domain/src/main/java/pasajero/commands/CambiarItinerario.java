package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Itinerario;

public class CambiarItinerario extends Command {
    private final Itinerario itinerarioNuevo;

    public CambiarItinerario(Itinerario itinerarioNuevo) {
        this.itinerarioNuevo = itinerarioNuevo;
    }

    public Itinerario getItinerarioNuevo() {
        return itinerarioNuevo;
    }
}
