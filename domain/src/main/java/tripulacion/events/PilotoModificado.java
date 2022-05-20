package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;

public class PilotoModificado extends DomainEvent {
    private final DatosPersonales datosPersonales;

    public PilotoModificado(DatosPersonales datosPersonales) {
        super("tripulacion.PilotoModificado");

        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
