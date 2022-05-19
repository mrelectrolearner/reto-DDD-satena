package pasajero;

import co.com.sofka.domain.generic.EventChange;
import pasajero.entities.Reservacion;
import pasajero.events.*;
import pasajero.values.Check;
import pasajero.values.TargetaDeEmbarque;

public class PasajeroEventChange extends EventChange {
    public PasajeroEventChange(Pasajero pasajero) {
        apply((ItinerarioAgregado event)->{
            pasajero.reservacion.agregarItinerario(event.getItinerario());
        });
        apply((AsientoCambiado event)->{
            pasajero.asiento=event.getAsientoNuevo();

        });

        apply((Checked event)->{
            pasajero.equipaje=event.getEquipaje();
            pasajero.asiento=event.getAsiento();
            pasajero.check=new Check(true);
        });
        apply((ItinerarioCambiado event)->{
            pasajero.reservacion();


        });

        apply((PasajeroCreado event)->{
            pasajero.datosPersonales=event.getDatosPersonales();
        });

        apply((TargetaDeEmbarqueGenerada event)->{
            var nombre=event.getNombre();
            var vuelo= event.getVuelo();
            var numeroTicket=event.getNumeroTicket();
            var asiento=event.getAsiento();
            var itinerario= event.getItinerario();
            pasajero.targetaDeEmbarque=new TargetaDeEmbarque(nombre,vuelo,itinerario,numeroTicket,asiento);
        });

        apply((VueloReservado event)->{
            var itinerario=event.getItinerario();
            var tarifa=event.getTarifa();
            var idReservacion=event.getIdReserva();
            pasajero.reservacion=new Reservacion(idReservacion,itinerario,tarifa);

        });
    }
}
