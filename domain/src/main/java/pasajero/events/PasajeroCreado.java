package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;
import pasajero.identities.IdPasajero;

public class PasajeroCreado extends DomainEvent {

    private final DatosPersonales datosPersonales;
    public PasajeroCreado(DatosPersonales datosPersonales) {
        super("pasajero.PasajeroCreado");

        this.datosPersonales=datosPersonales;

    }


    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
