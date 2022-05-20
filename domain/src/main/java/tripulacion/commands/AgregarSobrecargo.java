package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;
import tripulacion.identities.IdSobrecargo;
import tripulacion.identities.IdTripulacion;

public class AgregarSobrecargo extends Command {
    private final IdTripulacion idTripulacion;
    private final IdSobrecargo idSobrecargo;
    private final DatosPersonales datosPersonales;

    public AgregarSobrecargo(IdTripulacion idTripulacion, IdSobrecargo idSobrecargo, DatosPersonales datosPersonales) {
        this.idTripulacion = idTripulacion;
        this.idSobrecargo = idSobrecargo;
        this.datosPersonales = datosPersonales;
    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
