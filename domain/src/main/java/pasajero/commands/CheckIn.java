package pasajero.commands;

import co.com.sofka.domain.generic.Command;
import pasajero.identities.IdAsiento;
import pasajero.identities.IdEquipaje;
import pasajero.identities.IdPasajero;
import pasajero.values.*;

public class CheckIn extends Command {
    private final IdEquipaje idEquipaje;
    private final Peso peso;
    private final Volumen volumen;
    private final Tipo tipo;
    private final Descripcion descripcion;
    private final NumeroAsiento numeroAsiento;
    private final IdAsiento idAsiento;

    private final IdPasajero idPasajero;

    public CheckIn(IdEquipaje idEquipaje, Peso peso, Volumen volumen, Tipo tipo,
                   Descripcion descripcion, NumeroAsiento numeroAsiento, IdAsiento idAsiento, IdPasajero idPasajero)
    {
        this.idEquipaje = idEquipaje;
        this.peso = peso;
        this.volumen = volumen;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.numeroAsiento = numeroAsiento;
        this.idAsiento = idAsiento;
        this.idPasajero = idPasajero;
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
