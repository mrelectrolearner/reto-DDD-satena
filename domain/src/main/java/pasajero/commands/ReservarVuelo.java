package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Itinerario;
import pasajero.identities.IdReserva;
import pasajero.values.Tarifa;

public class ReservarVuelo extends Command {
    private final Itinerario itinerario;
    private final Tarifa tarifa;
    private final IdReserva idReserva;

    public ReservarVuelo(Itinerario itinerario, Tarifa tarifa, IdReserva idReserva) {
        this.itinerario = itinerario;
        this.tarifa = tarifa;
        this.idReserva = idReserva;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public IdReserva getIdReserva() {
        return idReserva;
    }
}
