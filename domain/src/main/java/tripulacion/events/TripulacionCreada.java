package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdPiloto;

public class TripulacionCreada extends DomainEvent {
    private final IdPiloto idPiloto;
    private final IdCopiloto idCopiloto;
    private final DatosPersonales datosPiloto;
    private final DatosPersonales datosCopiloto;

    public TripulacionCreada(IdPiloto idPiloto, IdCopiloto idCopiloto,DatosPersonales datosPiloto, DatosPersonales datosCopiloto) {
        super("TripulacionCreada");
        this.idPiloto = idPiloto;
        this.idCopiloto = idCopiloto;
        this.datosPiloto = datosPiloto;
        this.datosCopiloto = datosCopiloto;
    }

    public DatosPersonales getDatosPiloto() {
        return datosPiloto;
    }

    public DatosPersonales getDatosCopiloto() {
        return datosCopiloto;
    }

    public IdPiloto getIdPiloto() {
        return idPiloto;
    }

    public IdCopiloto getIdCopiloto() {
        return idCopiloto;
    }
}
