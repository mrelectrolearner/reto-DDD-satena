package tripulacion;

import co.com.sofka.domain.generic.AggregateEvent;
import tripulacion.entities.Copiloto;
import tripulacion.entities.Piloto;
import tripulacion.entities.Sobrecargo;
import tripulacion.identities.IdTripulacion;

import java.util.Set;

public class Tripulacion extends AggregateEvent<IdTripulacion> {
    protected Piloto piloto;
    protected Copiloto copiloto;
    protected Set<Sobrecargo> sobrecargos;

    public Tripulacion(IdTripulacion entityId) {
        super(entityId);
    }
}
