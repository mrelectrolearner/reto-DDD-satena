package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Fecha;
import tripulacion.identities.IdCopiloto;

public class VueloAgregadoCopiloto extends DomainEvent {
    private final IdCopiloto idCopiloto;
    private final Fecha fecha;

    public VueloAgregadoCopiloto(IdCopiloto idCopiloto, Fecha fecha) {
        super("VueloAgregadoCopiloto");
        this.idCopiloto = idCopiloto;
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public IdCopiloto getIdCopiloto() {
        return idCopiloto;
    }
}
