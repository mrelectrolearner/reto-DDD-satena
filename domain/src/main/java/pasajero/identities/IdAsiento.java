package pasajero.identities;

import co.com.sofka.domain.generic.Identity;

public class IdAsiento extends Identity {
    public IdAsiento(String id){
        super(id);
    }
    public static IdAsiento of(String id) {
        return new IdAsiento(id);
    }
}
