package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Itinerario implements ValueObject<Itinerario.Pros> {
    private CodigoVuelo codigoVuelo;
    private Fecha fecha;
    private Salida salida;
    private Origen origen;
    private Destino destino;
    private Llegada llegada;

    public Itinerario(CodigoVuelo codigoVuelo, Fecha fecha, Salida salida, Origen origen, Destino destino, Llegada llegada) {
        this.codigoVuelo = codigoVuelo;
        this.fecha = fecha;
        this.salida = salida;
        this.origen = origen;
        this.destino = destino;
        this.llegada = llegada;
    }

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public CodigoVuelo codigoVuelo() {
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
        CodigoVuelo codigoVuelo();
        Fecha fecha();
        Salida salida();
        Origen origen();
        Destino destino();
        Llegada llegada();
    }

}
