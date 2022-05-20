package vuelo.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Itinerario;
import vuelo.identities.IdVuelo;

public class CrearVuelo extends Command {
    private IdVuelo idVuelo;
    private Itinerario itinerario;

    public CrearVuelo(IdVuelo idVuelo, Itinerario itinerario) {
        this.idVuelo = idVuelo;
        this.itinerario = itinerario;
    }

    public IdVuelo getIdVuelo() {
        return idVuelo;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }
}
