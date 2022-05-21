package tripulacion.identities;

import co.com.sofka.domain.generic.Identity;

public class IdCopiloto extends Identity {

    public IdCopiloto(String uuid) {
        super(uuid);
    }

    public static IdCopiloto of(String id) {
        return new IdCopiloto(id);
    }
}
