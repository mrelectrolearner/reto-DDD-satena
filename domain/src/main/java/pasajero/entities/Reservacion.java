package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdReserva;
import pasajero.values.EstadoReserva;
import generics.values.Itinerario;
import pasajero.values.Tarifa;

public class Reservacion extends Entity<IdReserva> {
    protected EstadoReserva estado;
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
    public void cambiarItinerario(Itinerario itinerario){
        this.itinerario=itinerario;
    }

    public void cambiarEstado(EstadoReserva estado){
        this.estado=estado;
    }
    public void cambiarTarifa(Tarifa tarifa){
        this.tarifa=tarifa;
    }

    public EstadoReserva estado() {
        return estado;
    }

    public Itinerario itinerario() {
        return this.itinerario;
    }

    public Tarifa tarifa() {
        return tarifa;
    }






}
