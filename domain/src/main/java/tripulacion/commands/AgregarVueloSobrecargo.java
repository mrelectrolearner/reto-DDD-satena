package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Fecha;
import tripulacion.identities.IdSobrecargo;

public class AgregarVueloSobrecargo extends Command {
    private final IdSobrecargo idSobrecargo;
    private final Fecha fecha;

    public AgregarVueloSobrecargo(IdSobrecargo idSobrecargo, Fecha fecha) {
        this.idSobrecargo = idSobrecargo;
        this.fecha = fecha;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
