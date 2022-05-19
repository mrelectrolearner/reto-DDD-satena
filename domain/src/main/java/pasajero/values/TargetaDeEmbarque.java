package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.entities.Asiento;
import vuelo.Vuelo;

public class TargetaDeEmbarque implements ValueObject<TargetaDeEmbarque.Pros> {
    private Nombre nombrePasajero;
    private Vuelo vuelo;
    private Itinerario itinerario;
    private NumeroTicket numeroTicket;
    private Asiento asiento;

    public TargetaDeEmbarque(Nombre nombrePasajero, Vuelo vuelo, Itinerario itinerario, NumeroTicket numeroTicket,Asiento asiento) {
        this.nombrePasajero = nombrePasajero;
        this.vuelo = vuelo;
        this.itinerario = itinerario;
        this.numeroTicket = numeroTicket;
        this.asiento=asiento;
    }

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

            @Override
            public Asiento asiento() {
                return asiento;
            }
        };
    }


    public interface Pros {
        Nombre nombre();
        Vuelo vuelo();
        Itinerario itinerario();
        NumeroTicket numeroTicket();
        Asiento asiento();
    }
}
