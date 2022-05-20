package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;
import tripulacion.entities.Copiloto;

public class CopilotoCambiado extends DomainEvent {
    private final DatosPersonales datosPersonales;

    public CopilotoCambiado(DatosPersonales datosPersonales) {
        super("CopilotoCambiado");
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
