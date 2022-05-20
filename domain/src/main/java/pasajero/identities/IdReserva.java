package pasajero.identities;

import co.com.sofka.domain.generic.Identity;

public class IdReserva extends Identity {
    public IdReserva(String id) {
        super(id);
    }

    public static IdReserva of(String id) {
        return new IdReserva(id);
    }
}
