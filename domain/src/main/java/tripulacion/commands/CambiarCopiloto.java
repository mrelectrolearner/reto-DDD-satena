package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;

public class CambiarCopiloto extends Command {
    private final DatosPersonales datosPersonales;

    public CambiarCopiloto(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
