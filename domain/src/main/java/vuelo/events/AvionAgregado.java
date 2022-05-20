package vuelo.events;

import co.com.sofka.domain.generic.DomainEvent;
import vuelo.identities.IdAvion;
import vuelo.values.Capacidad;
import vuelo.values.Modelo;

public class AvionAgregado extends DomainEvent {
    private final IdAvion idAvion;
    private final Modelo modelo;
    private final Capacidad capacidad;

    public AvionAgregado(IdAvion idAvion, Modelo modelo, Capacidad capacidad) {
        super("vuelo.AvionAgregado");
        this.idAvion = idAvion;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public IdAvion getIdAvion() {
        return idAvion;
    }
}
