package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.identities.IdAsiento;
import pasajero.identities.IdEquipaje;
import pasajero.identities.IdPasajero;
import pasajero.values.*;

public class Checked extends DomainEvent {
    private final IdPasajero idPasajero;
    private final IdEquipaje idEquipaje;
    private final Peso peso;
    private final Volumen volumen;
    private final Tipo tipo;
    private final Descripcion descripcion;
    private final NumeroAsiento numeroAsiento;
    private final IdAsiento idAsiento;
    public Checked(IdPasajero idPasajero, IdEquipaje idEquipaje, Peso peso, Volumen volumen, Tipo tipo, Descripcion descripcion, NumeroAsiento asiento, IdAsiento idAsiento) {
        super("pasajero.Checked");
        this.idPasajero = idPasajero;
        this.volumen = volumen;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.peso=peso;
        this.numeroAsiento=asiento;
        this.idAsiento = idAsiento;
        this.idEquipaje=idEquipaje;
    }

    public IdPasajero getIdPasajero() {
        return idPasajero;
    }

    public IdEquipaje getIdEquipaje() {
        return idEquipaje;
    }

    public Peso getPeso() {
        return peso;
    }

    public Volumen getVolumen() {
        return volumen;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public NumeroAsiento getNumeroAsiento() {
        return numeroAsiento;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
