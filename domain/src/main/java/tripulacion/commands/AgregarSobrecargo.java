package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;
import tripulacion.identities.IdSobrecargo;

public class AgregarSobrecargo extends Command {
    private final IdSobrecargo idSobrecargo;
    private final DatosPersonales datosPersonales;

    public AgregarSobrecargo(IdSobrecargo idSobrecargo, DatosPersonales datosPersonales) {
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
