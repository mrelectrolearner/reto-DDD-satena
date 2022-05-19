package tripulacion.entities;

import co.com.sofka.domain.generic.Entity;
import generics.values.DatosPersonales;
import tripulacion.identities.IdCopiloto;
import tripulacion.values.Disponibilidad;
import generics.values.Fecha;

import java.util.HashMap;

public class Copiloto extends Entity<IdCopiloto> {
    protected DatosPersonales datosPersonales;
    private HashMap<Fecha, Disponibilidad> calendarioVuelos;


    public Copiloto(IdCopiloto entityId) {
        super(entityId);
    }
}
