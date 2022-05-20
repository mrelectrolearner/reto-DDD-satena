package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import tripulacion.identities.IdSobrecargo;

public class SobrecargoEliminado extends DomainEvent {
    private final IdSobrecargo idSobrecargo;

    public SobrecargoEliminado(IdSobrecargo idSobrecargo) {
        super("tripulacion.SobrecargoEliminado");
        this.idSobrecargo = idSobrecargo;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }
}
