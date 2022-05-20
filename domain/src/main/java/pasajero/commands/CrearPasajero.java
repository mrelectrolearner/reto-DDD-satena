package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;

public class CrearPasajero extends Command {
    private final DatosPersonales datosPersonales;

    public CrearPasajero(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
