package vuelo.identities;

import co.com.sofka.domain.generic.Identity;

public class IdVuelo extends Identity {
    public IdVuelo(String id) {
        super(id);
    }

    public static IdVuelo of(String id) {
        return new IdVuelo(id);
    }


}
