package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;
import tripulacion.entities.Piloto;

public class PilotoCambiado extends DomainEvent {
    private final DatosPersonales datosPersonales;

    public PilotoCambiado(DatosPersonales datosPersonales) {
        super("tripulacion.PilotoCambiado");

        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
