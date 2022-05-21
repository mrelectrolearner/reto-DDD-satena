package vuelo.identities;

import co.com.sofka.domain.generic.Identity;

public class IdCarga extends Identity {
    public IdCarga(String uuid) {
        super(uuid);
    }

    public IdCarga of(String id){
        return new IdCarga(id);
    }
}

