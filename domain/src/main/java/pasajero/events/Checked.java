package pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import pasajero.entities.Asiento;
import pasajero.entities.Equipaje;

public class Checked extends DomainEvent {
    private final Equipaje equipaje;
    private final Asiento asiento;
    public Checked(Equipaje equipaje, Asiento asiento) {
        super("Checked");
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
