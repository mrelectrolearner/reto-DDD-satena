package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import tripulacion.identities.IdSobrecargo;
import tripulacion.identities.IdTripulacion;

public class SobrecargoEliminado extends Command {
    private final IdTripulacion idTripulacion;
    private final IdSobrecargo idSobrecargo;

    public SobrecargoEliminado(IdTripulacion idTripulacion, IdSobrecargo idSobrecargo) {
        this.idTripulacion = idTripulacion;
        this.idSobrecargo = idSobrecargo;
    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }
}
