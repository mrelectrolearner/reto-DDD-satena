package tripulacion.commands;

import co.com.sofka.domain.generic.Command;
import generics.values.Fecha;
import tripulacion.identities.IdSobrecargo;
import tripulacion.identities.IdTripulacion;

public class AgregarVueloSobrecargo extends Command {
    private final IdTripulacion idTripulacion;
    private final IdSobrecargo idSobrecargo;
    private final Fecha fecha;

    public AgregarVueloSobrecargo(IdTripulacion idTripulacion, IdSobrecargo idSobrecargo, Fecha fecha) {
        this.idTripulacion = idTripulacion;
        this.idSobrecargo = idSobrecargo;
        this.fecha = fecha;
    }

    public IdTripulacion getIdTripulacion() {
        return idTripulacion;
    }

    public IdSobrecargo getIdSobrecargo() {
        return idSobrecargo;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
