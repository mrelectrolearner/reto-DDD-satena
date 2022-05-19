package tripulacion.entities;

import co.com.sofka.domain.generic.Entity;
import generics.values.DatosPersonales;
import tripulacion.identities.IdPiloto;
import tripulacion.values.Disponibilidad;
import generics.values.Fecha;

import java.util.HashMap;

public class Piloto extends Entity<IdPiloto> {
    protected DatosPersonales datosPersonales;
    protected HashMap<Fecha, Disponibilidad> calendarioVuelos;


    public Piloto(IdPiloto entityId) {
        super(entityId);
    }
}
