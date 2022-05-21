package tripulacion.identities;

import co.com.sofka.domain.generic.Identity;

public class IdSobrecargo extends Identity {

    public IdSobrecargo(String uuid) {
        super(uuid);
    }

    public static IdSobrecargo of(String id) {
        return new IdSobrecargo(id);
    }
}
