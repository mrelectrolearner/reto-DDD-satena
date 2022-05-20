package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.DatosPersonales;
import pasajero.identities.IdPasajero;

public class CrearPasajero extends Command {
    private final IdPasajero idPasajero;
    private final DatosPersonales datosPersonales;

    public CrearPasajero(IdPasajero idPasajero, DatosPersonales datosPersonales) {
        this.idPasajero = idPasajero;
        this.datosPersonales = datosPersonales;
    }

    public IdPasajero getIdPasajero() {
        return idPasajero;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
