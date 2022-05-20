package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Itinerario;
import pasajero.identities.IdPasajero;

public class CambiarItinerario extends Command {
    private final Itinerario itinerarioNuevo;
    private final IdPasajero idPasajero;
    public CambiarItinerario(Itinerario itinerarioNuevo, IdPasajero idPasajero) {
        this.itinerarioNuevo = itinerarioNuevo;
        this.idPasajero = idPasajero;
    }

    public IdPasajero getIdPasajero() {
        return idPasajero;
    }

    public Itinerario getItinerarioNuevo() {
        return itinerarioNuevo;
    }
}
