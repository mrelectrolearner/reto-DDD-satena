package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdReserva;
import pasajero.values.EstadoReserva;
import generics.values.Itinerario;
import pasajero.values.Numero;
import pasajero.values.Tarifa;

public class Reservacion extends Entity<IdReserva> {
    protected EstadoReserva Estado;
    protected Itinerario itinerario;
    protected Tarifa tarifa;

    public Reservacion(IdReserva entityId) {
        super(entityId);
    }

    public EstadoReserva estado() {
        return Estado;
    }

    public Itinerario itinerario() {
        return itinerario;
    }

    public Tarifa tarifa() {
        return tarifa;
    }
}
