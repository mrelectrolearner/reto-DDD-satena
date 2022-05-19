package pasajero.identities;

import co.com.sofka.domain.generic.Identity;

public class IdPasajero extends Identity {
    public IdPasajero(String id){
        super(id);
    }
    public static IdPasajero of(String id) {
        return new IdPasajero(id);
    }

}
