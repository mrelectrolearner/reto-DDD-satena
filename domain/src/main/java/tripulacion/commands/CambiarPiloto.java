package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;

public class CambiarPiloto extends Command {
    private final DatosPersonales datosPersonales;

    public CambiarPiloto(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
