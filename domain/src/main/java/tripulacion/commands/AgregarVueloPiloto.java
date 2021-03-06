package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Fecha;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdTripulacion;

public class AgregarVueloPiloto extends Command {
    private final IdTripulacion idTripulacion;
    private final IdPiloto idPiloto;
    private final Fecha fecha;

    public AgregarVueloPiloto(IdTripulacion idTripulacion, IdPiloto idPiloto, Fecha fecha) {
        this.idTripulacion = idTripulacion;
        this.idPiloto = idPiloto;
        this.fecha = fecha;
    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public IdPiloto getIdPiloto() {
        return idPiloto;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
