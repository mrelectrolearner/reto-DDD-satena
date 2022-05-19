package pasajero;

import co.com.sofka.domain.generic.EventChange;
import pasajero.entities.Asiento;
import pasajero.entities.Reservacion;
import pasajero.events.*;
import pasajero.values.Check;
import pasajero.values.TargetaDeEmbarque;

public class PasajeroEventChange extends EventChange {
    public PasajeroEventChange(Pasajero pasajero) {

        apply((AsientoCambiado event)->{
            var numeroAsiento=event.getNumeroAsientoNuevo();
            var idAsiento=event.getIdAsiento();
            Asiento asiento =new Asiento(idAsiento,numeroAsiento);
            pasajero.asiento=asiento;

        });

        apply((Checked event)->{
            var numeroAsiento=event.getNumeroAsiento();
            Asiento asiento =new Asiento(event.getIdAsiento(),numeroAsiento);
            pasajero.equipaje=event.getEquipaje();
            pasajero.asiento=asiento;
            pasajero.check=new Check(true);
        });
        apply((ItinerarioCambiado event)->{
            pasajero.reservacion.agregarItinerario(event.getItinerarioNuevo());

        });


        apply((PasajeroCreado event)->{
            pasajero.datosPersonales=event.getDatosPersonales();
        });

        apply((TargetaDeEmbarqueGenerada event)->{
            var nombre=event.getNombre();
            var idVuelo= event.getVuelo();
            var numeroTicket=event.getNumeroTicket();
            var numeroAsiento =event.getNumero();
            var itinerario= event.getItinerario();
            pasajero.targetaDeEmbarque=new TargetaDeEmbarque(nombre,idVuelo,itinerario,numeroTicket, numeroAsiento);
        });

        apply((VueloReservado event)->{
            var itinerario=event.getItinerario();
            var tarifa=event.getTarifa();
            var idReservacion=event.getIdReserva();
            pasajero.reservacion=new Reservacion(idReservacion,itinerario,tarifa);

        });
    }
}
