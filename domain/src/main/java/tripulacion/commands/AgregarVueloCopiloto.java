package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Fecha;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdTripulacion;

public class AgregarVueloCopiloto extends Command {
    private final IdTripulacion idTripulacion;
    private final IdCopiloto idCopiloto;
    private final Fecha fecha;

    public AgregarVueloCopiloto(IdTripulacion idTripulacion, IdCopiloto idCopiloto, Fecha fecha) {
        this.idTripulacion = idTripulacion;
        this.idCopiloto = idCopiloto;
        this.fecha = fecha;
    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public IdCopiloto getIdCopiloto() {
        return idCopiloto;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
