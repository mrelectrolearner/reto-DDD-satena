package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.values.NumeroAsiento;
import pasajero.values.NumeroTicket;
import vuelo.identities.IdVuelo;

public class GenerarTargetaDeEmbargue extends Command {
    private final Nombre nombre;
    private final NumeroTicket numeroTicket;
    private final NumeroAsiento numeroAsiento;
    private final IdVuelo idVuelo;
    private final Itinerario itinerario;

    public GenerarTargetaDeEmbargue(Nombre nombre, NumeroTicket numeroTicket, NumeroAsiento numeroAsiento, IdVuelo idVuelo, Itinerario itinerario) {
        this.nombre = nombre;
        this.numeroTicket = numeroTicket;
        this.numeroAsiento = numeroAsiento;
        this.idVuelo = idVuelo;
        this.itinerario = itinerario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroTicket getNumeroTicket() {
        return numeroTicket;
    }

    public NumeroAsiento getNumeroAsiento() {
        return numeroAsiento;
    }

    public IdVuelo getIdVuelo() {
        return idVuelo;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }
}
