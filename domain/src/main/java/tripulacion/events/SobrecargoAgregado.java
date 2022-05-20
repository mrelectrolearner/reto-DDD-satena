package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;
import tripulacion.identities.IdSobrecargo;

public class SobrecargoAgregado extends DomainEvent {
    private final IdSobrecargo idSobrecargo;
    private final DatosPersonales datosPersonales;

    public SobrecargoAgregado(IdSobrecargo idSobrecargo, DatosPersonales datosPersonales) {
        super("tripulacion.SobrecargoAgregado");
        this.idSobrecargo = idSobrecargo;
        this.datosPersonales = datosPersonales;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
