package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdTripulacion;

public class CambiarCopiloto extends Command {
    private final IdTripulacion idTripulacion;
    private final IdCopiloto idCopiloto;
    private final DatosPersonales datosPersonales;

    public CambiarCopiloto(IdTripulacion idTripulacion, IdCopiloto idCopiloto, DatosPersonales datosPersonales) {
        this.idTripulacion = idTripulacion;
        this.idCopiloto = idCopiloto;
        this.datosPersonales = datosPersonales;
    }

    public IdCopiloto getIdCopiloto() {
        return idCopiloto;
    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
