package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.identities.IdAsiento;
import pasajero.identities.IdPasajero;
import pasajero.values.NumeroAsiento;

public class CambiarAsiento extends Command {
    private final NumeroAsiento numeroAsientoAsientoNuevo;
    private final IdAsiento idAsiento;
    private final IdPasajero idPasajero;

    public CambiarAsiento(NumeroAsiento numeroAsientoAsientoNuevo, IdAsiento idAsiento, IdPasajero idPasajero) {
        this.numeroAsientoAsientoNuevo = numeroAsientoAsientoNuevo;
        this.idAsiento = idAsiento;
        this.idPasajero = idPasajero;
    }

    public IdPasajero getIdPasajero() {
        return idPasajero;
    }

    public NumeroAsiento getNumeroAsientoAsientoNuevo() {
        return numeroAsientoAsientoNuevo;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
