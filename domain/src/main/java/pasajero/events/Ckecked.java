package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.entities.Asiento;
import pasajero.entities.Equipaje;

public class Ckecked extends DomainEvent {
    private final Equipaje equipaje;
    private final Asiento asiento;
    public Ckecked(Equipaje equipaje, Asiento asiento) {
        super("Ckecked");
        this.equipaje=equipaje;
        this.asiento=asiento;
    }

    public Equipaje getEquipaje() {
        return equipaje;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}
