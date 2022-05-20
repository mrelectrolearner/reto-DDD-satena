package vuelo;

import co.com.sofka.domain.generic.EventChange;
import vuelo.entities.Avion;
import vuelo.entities.Ruta;
import vuelo.events.AvionAgregado;
import vuelo.events.VueloCreado;
import vuelo.identities.IdRuta;

public class VueloEventChange extends EventChange {
    public VueloEventChange(Vuelo vuelo) {

        apply((VueloCreado event)->{
            var idRuta=new IdRuta();
            vuelo.ruta=new Ruta(idRuta,event.getItinerario());
        });

        apply((AvionAgregado event)->{
            var idAvion =event.getIdAvion();
            var modelo=event.getModelo();
            var capacidad=event.getCapacidad();
            vuelo.avion=new Avion(idAvion,modelo,capacidad);
        });
    }
}
