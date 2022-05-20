package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Fecha;
import tripulacion.identities.IdPiloto;

public class AgregarVueloPiloto extends Command {
    private final IdPiloto idPiloto;
    private final Fecha fecha;

    public AgregarVueloPiloto(IdPiloto idPiloto, Fecha fecha) {
        this.idPiloto = idPiloto;
        this.fecha = fecha;
    }

    public IdPiloto getIdPiloto() {
        return idPiloto;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
