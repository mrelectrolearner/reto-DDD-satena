package tripulacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import generics.values.DatosPersonales;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdPiloto;

public class TripulacionCreada extends DomainEvent {
    private final IdPiloto idPiloto;

    private final DatosPersonales datosPiloto;


    public TripulacionCreada(IdPiloto idPiloto, DatosPersonales datosPiloto) {
        super("tripulacion.TripulacionCreada");
        this.idPiloto = idPiloto;

        this.datosPiloto = datosPiloto;

    }

    public DatosPersonales getDatosPiloto() {
        return datosPiloto;
    }



    public IdPiloto getIdPiloto() {
        return idPiloto;
    }

}
