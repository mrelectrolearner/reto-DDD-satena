package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;
import generics.values.Itinerario;
import generics.values.Nombre;
import vuelo.Vuelo;

public class TargetaDeEmbarque implements ValueObject<TargetaDeEmbarque.Pros> {
    private Nombre nombrePasajero;
    private Vuelo vuelo;
    private Itinerario itinerario;
    private NumeroTicket numeroTicket;

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public Nombre nombre() {
                return nombrePasajero;
            }

            @Override
            public Vuelo vuelo() {
                return vuelo;
            }

            @Override
            public Itinerario itinerario() {
                return itinerario;
            }

            @Override
            public NumeroTicket numeroTicket() {
                return numeroTicket;
            }
        };
    }


    public interface Pros {
        Nombre nombre();
        Vuelo vuelo();
        Itinerario itinerario();
        NumeroTicket numeroTicket();
    }
}
