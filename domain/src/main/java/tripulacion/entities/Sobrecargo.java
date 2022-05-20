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

    public Sobrecargo(IdSobrecargo entityId,DatosPersonales datosPersonales) {
        super(entityId);
        this.datosPersonales=datosPersonales;
    }
    public void agregarVuelo(Fecha fecha){
        Disponibilidad nodisponible =new Disponibilidad(Disponibilidad.EstadoTripulante.NODISPONIBLE);
        this.calendarioVuelos.put(fecha, nodisponible);
    }

    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }

    public HashMap<Fecha, Disponibilidad> calendarioVuelos() {
        return calendarioVuelos;
    }
}
