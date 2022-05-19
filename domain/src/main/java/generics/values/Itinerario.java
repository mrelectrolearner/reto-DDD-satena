package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Itinerario implements ValueObject<Itinerario.Pros> {
    private String codigoVuelo;
    private Fecha fecha;
    private Salida salida;
    private Origen origen;
    private Destino destino;
    private Llegada llegada;

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public String codigoVuelo() {
                return codigoVuelo;
            }

            @Override
            public Fecha fecha() {
                return fecha;
            }

            @Override
            public Salida salida() {
                return salida;
            }

            @Override
            public Origen origen() {
                return origen;
            }

            @Override
            public Destino destino() {
                return destino;
            }

            @Override
            public Llegada llegada() {
                return llegada;
            }
        };
    }


    public interface Pros {
        String codigoVuelo();
        Fecha fecha();
        Salida salida();
        Origen origen();
        Destino destino();
        Llegada llegada();
    }

}
