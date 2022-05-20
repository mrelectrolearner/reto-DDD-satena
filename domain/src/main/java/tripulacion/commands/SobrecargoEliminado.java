package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import tripulacion.identities.IdSobrecargo;

public class SobrecargoEliminado extends Command {
    private final IdSobrecargo idSobrecargo;

    public SobrecargoEliminado(IdSobrecargo idSobrecargo) {
        this.idSobrecargo = idSobrecargo;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }
}
