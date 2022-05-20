package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Fecha;
import tripulacion.identities.IdPiloto;

public class VueloAgregadoPiloto extends DomainEvent {
    private final IdPiloto idPiloto;
    private final Fecha fecha;

    public VueloAgregadoPiloto(IdPiloto idPiloto, Fecha fecha) {
        super("VueloAgregadoPiloto");
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
