package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Fecha;
import tripulacion.identities.IdCopiloto;

public class AgregarVueloCopiloto extends Command {
    private final IdCopiloto idCopiloto;
    private final Fecha fecha;

    public AgregarVueloCopiloto(IdCopiloto idCopiloto, Fecha fecha) {
        this.idCopiloto = idCopiloto;
        this.fecha = fecha;
    }

    public IdCopiloto getIdCopiloto() {
        return idCopiloto;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
