package pasajero.identities;

import co.com.sofka.domain.generic.Identity;

public class IdEquipaje extends Identity {
    public IdEquipaje(String id){
        super(id);
    }
    public static IdEquipaje of(String id) {
        return new IdEquipaje(id);
    }
}
