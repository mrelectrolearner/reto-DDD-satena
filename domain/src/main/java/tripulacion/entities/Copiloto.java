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


    public Copiloto(IdCopiloto entityId, DatosPersonales datosPersonales) {
        super(entityId);
        this.datosPersonales=datosPersonales;
        this.calendarioVuelos=new HashMap<>();
    }
    public void cambiarDatosPersonales(DatosPersonales datosPersonales){
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
