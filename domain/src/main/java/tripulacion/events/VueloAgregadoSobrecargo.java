package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Fecha;
import tripulacion.identities.IdSobrecargo;

public class VueloAgregadoSobrecargo extends DomainEvent {
    private final IdSobrecargo idSobrecargo;
    private final Fecha fecha;

    public VueloAgregadoSobrecargo(IdSobrecargo idSobrecargo, Fecha fecha) {
        super("tripulacion.VueloAgregadoSobrecargo");

        this.idSobrecargo = idSobrecargo;
        this.fecha = fecha;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
