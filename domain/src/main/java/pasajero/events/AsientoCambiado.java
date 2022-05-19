package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.identities.IdAsiento;
import pasajero.values.NumeroAsiento;

public class AsientoCambiado extends DomainEvent {
    private final NumeroAsiento numeroAsientoAsientoNuevo;
    private final IdAsiento idAsiento;
    public AsientoCambiado(NumeroAsiento nuevoAsiento, IdAsiento idAsiento) {
        super("AsientoCambiado");
        this.numeroAsientoAsientoNuevo =nuevoAsiento;

        this.idAsiento = idAsiento;
    }

    public NumeroAsiento getNumeroAsientoNuevo() {
        return numeroAsientoAsientoNuevo;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
