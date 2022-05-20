package tripulacion.identities;

import co.com.sofka.domain.generic.Identity;

public class IdPiloto extends Identity {
    public IdPiloto(String uuid) {
        super(uuid);
    }

    public static IdPiloto of(String id) {
        return new IdPiloto(id);
    }
}
