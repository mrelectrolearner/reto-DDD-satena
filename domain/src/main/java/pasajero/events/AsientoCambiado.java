package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.entities.Asiento;

public class AsientoCambiado extends DomainEvent {
    private final Asiento asientoNuevo;
    public AsientoCambiado( Asiento nuevoAsiento) {
        super("AsientoCambiado");
        this.asientoNuevo =nuevoAsiento;

    }


    public Asiento getAsientoNuevo() {
        return asientoNuevo;
    }
}
