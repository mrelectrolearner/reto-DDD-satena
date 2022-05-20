package tripulacion.identities;

import co.com.sofka.domain.generic.Identity;

public class IdTripulacion extends Identity {
    public IdTripulacion(String uuid) {
        super(uuid);
    }

    public static IdTripulacion of(String id) {
        return new IdTripulacion(id);
    }
}
