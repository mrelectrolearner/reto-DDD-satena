package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.entities.Asiento;

public class AsientoCambiado extends DomainEvent {
    private final Asiento asientoActual;
    private final Asiento asientoNuevo;
    public AsientoCambiado(Asiento asientoActual, Asiento nuevoAsiento) {
        super("AsientoCambiado");
        this.asientoActual =asientoActual;
        this.asientoNuevo =nuevoAsiento;

    }

    public Asiento getAsientoActual() {
        return asientoActual;
    }

    public Asiento getAsientoNuevo() {
        return asientoNuevo;
    }
}
