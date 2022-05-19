package tripulacion.values;

import co.com.sofka.domain.generic.ValueObject;
import generics.values.Fecha;

import java.util.HashMap;

public class CalendarioVuelo implements ValueObject<HashMap<Fecha,Disponibilidad>> {
    private HashMap<Fecha,Disponibilidad> dispnibilidadPorFecha;


    @Override
    public HashMap<Fecha, Disponibilidad> value() {
        return dispnibilidadPorFecha;
    }
}
