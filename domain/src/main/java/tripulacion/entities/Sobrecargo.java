package tripulacion.entities;

import co.com.sofka.domain.generic.Entity;
import generics.values.DatosPersonales;
import tripulacion.identities.IdSobrecargo;
import tripulacion.values.Disponibilidad;
import generics.values.Fecha;

import java.util.HashMap;

public class Sobrecargo extends Entity<IdSobrecargo> {
    protected DatosPersonales datosPersonales;
    protected HashMap<Fecha, Disponibilidad> calendarioVuelos;

    public Sobrecargo(IdSobrecargo entityId) {
        super(entityId);
    }
}
