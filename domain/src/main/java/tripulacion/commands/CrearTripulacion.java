package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdTripulacion;

public class CrearTripulacion extends Command {
    private final IdTripulacion idTripulacion;
    private final IdPiloto idPiloto;
    private final DatosPersonales datosPersonales;


    public CrearTripulacion(IdTripulacion idTripulacion, IdPiloto idPiloto,DatosPersonales datosPersonales) {
        this.idTripulacion = idTripulacion;
        this.idPiloto = idPiloto;
        this.datosPersonales = datosPersonales;


    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public IdPiloto getIdPiloto() {
        return idPiloto;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
