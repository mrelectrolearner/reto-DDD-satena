package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.entities.Equipaje;
import pasajero.identities.IdAsiento;
import pasajero.values.Numero;

public class Checked extends DomainEvent {
    private final Equipaje equipaje;
    private final Numero numeroAsiento;
    private final IdAsiento idAsiento;
    public Checked(Equipaje equipaje, Numero asiento, IdAsiento idAsiento) {
        super("Checked");
        this.equipaje=equipaje;
        this.numeroAsiento=asiento;
        this.idAsiento = idAsiento;
    }

    public Equipaje getEquipaje() {
        return equipaje;
    }

    public Numero getNumeroAsiento() {
        return numeroAsiento;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
