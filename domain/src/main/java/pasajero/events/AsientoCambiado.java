package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.identities.IdAsiento;
import pasajero.values.Numero;

public class AsientoCambiado extends DomainEvent {
    private final Numero numeroAsientoNuevo;
    private final IdAsiento idAsiento;
    public AsientoCambiado(Numero nuevoAsiento, IdAsiento idAsiento) {
        super("AsientoCambiado");
        this.numeroAsientoNuevo =nuevoAsiento;

        this.idAsiento = idAsiento;
    }

    public Numero getNumeroAsientoNuevo() {
        return numeroAsientoNuevo;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
