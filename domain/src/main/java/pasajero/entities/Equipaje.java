package pasajero.entities;

import co.com.sofka.domain.generic.Entity;
import pasajero.identities.IdEquipaje;
import pasajero.values.*;

public class Equipaje extends Entity<IdEquipaje> {
    private Peso peso;
    private Volumen volumen;
    private Tipo tipo;
    private Descripcion descripcion;

    public Equipaje(IdEquipaje entityId, Peso peso, Volumen volumen, Tipo tipo, Descripcion descripcion) {
        super(entityId);
        this.peso = peso;
        this.volumen = volumen;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Equipaje(IdEquipaje entityId) {
        super(entityId);
    }
}
