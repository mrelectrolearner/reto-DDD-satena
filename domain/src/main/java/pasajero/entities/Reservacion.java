package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdReserva;
import pasajero.values.EstadoReserva;
import generics.values.Itinerario;
import pasajero.values.Tarifa;

import java.util.Set;

public class Reservacion extends Entity<IdReserva> {
    protected EstadoReserva Estado;
    protected Itinerario itinerario;
    protected Tarifa tarifa;

    public Reservacion(IdReserva entityId) {
        super(entityId);
    }

    public Reservacion(IdReserva entityId,Itinerario itinerario, Tarifa tarifa) {
        super(entityId);
        this.tarifa=tarifa;
        this.itinerario=itinerario;
    }

    public EstadoReserva estado() {
        return Estado;
    }

    public Itinerario itinerario() {
        return this.itinerario;
    }

    public Tarifa tarifa() {
        return tarifa;
    }

    public void agregarItinerario(Itinerario itinerario){
        this.itinerario=itinerario;
    }




}
