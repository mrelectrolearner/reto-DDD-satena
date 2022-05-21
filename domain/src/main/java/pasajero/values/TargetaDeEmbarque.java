package pasajero.values;

import co.com.sofka.domain.generic.ValueObject;
import generics.values.Itinerario;
import generics.values.Nombre;
import vuelo.identities.IdVuelo;

import java.util.Objects;

public class TargetaDeEmbarque implements ValueObject<TargetaDeEmbarque.Pros> {
    private Nombre nombrePasajero;
    private IdVuelo idVuelo;
    private Itinerario itinerario;
    private NumeroTicket numeroTicket;
    private NumeroAsiento numeroAsiento;

    public TargetaDeEmbarque(Nombre nombrePasajero, IdVuelo idVuelo, Itinerario itinerario, NumeroTicket numeroTicket, NumeroAsiento numeroAsiento) {
        this.nombrePasajero = Objects.requireNonNull(nombrePasajero);
        this.idVuelo =Objects.requireNonNull(idVuelo);
        this.itinerario =Objects.requireNonNull(itinerario);
        this.numeroTicket =numeroTicket;
        this.numeroAsiento =Objects.requireNonNull(numeroAsiento);
    }

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public Nombre nombre() {
                return nombrePasajero;
            }

            @Override
            public IdVuelo IdVuelo() {
                return idVuelo;
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
            public NumeroAsiento numeroAsiento() {
                return numeroAsiento;
            }
        };
    }


    public interface Pros {
        Nombre nombre();
        IdVuelo IdVuelo();
        Itinerario itinerario();
        NumeroTicket numeroTicket();
        NumeroAsiento numeroAsiento();
    }
}
