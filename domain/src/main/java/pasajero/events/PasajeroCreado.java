package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;

public class PasajeroCreado extends DomainEvent {
    private final DatosPersonales datosPersonales;
    public PasajeroCreado(DatosPersonales datosPersonales) {
        super("PasajeroCreado");
        this.datosPersonales=datosPersonales;

    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
