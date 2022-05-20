package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.identities.IdAsiento;
import pasajero.values.NumeroAsiento;

public class CambiarAsiento extends Command {
    private final NumeroAsiento numeroAsientoAsientoNuevo;
    private final IdAsiento idAsiento;

    public CambiarAsiento(NumeroAsiento numeroAsientoAsientoNuevo, IdAsiento idAsiento) {
        this.numeroAsientoAsientoNuevo = numeroAsientoAsientoNuevo;
        this.idAsiento = idAsiento;
    }

    public NumeroAsiento getNumeroAsientoAsientoNuevo() {
        return numeroAsientoAsientoNuevo;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
