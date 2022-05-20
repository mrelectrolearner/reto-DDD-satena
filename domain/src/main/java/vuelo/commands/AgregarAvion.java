package vuelo.commands;

import co.com.sofka.domain.generic.Command;
import vuelo.identities.IdAvion;
import vuelo.identities.IdVuelo;
import vuelo.values.Capacidad;
import vuelo.values.Modelo;

public class AgregarAvion extends Command {
    private final IdVuelo idVuelo;
    private final IdAvion idAvion;
    private final Modelo modelo;
    private final Capacidad capacidad;

    public AgregarAvion(IdVuelo idVuelo, IdAvion idAvion, Modelo modelo, Capacidad capacidad) {
        this.idVuelo = idVuelo;
        this.idAvion = idAvion;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public IdAvion getIdAvion() {
        return idAvion;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public IdVuelo getIdVuelo() {
        return idVuelo;
    }
}
