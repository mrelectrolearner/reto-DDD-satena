package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdTripulacion;

public class ModificarPiloto extends Command {
    private final IdTripulacion idTripulacion;

    private final IdPiloto idPiloto;
    private final DatosPersonales datosPersonales;

    public ModificarPiloto(IdTripulacion idTripulacion, IdPiloto idPiloto, DatosPersonales datosPersonales) {
        this.idTripulacion = idTripulacion;
        this.idPiloto = idPiloto;
        this.datosPersonales = datosPersonales;
    }

    public IdPiloto getIdPiloto() {
        return idPiloto;
    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
