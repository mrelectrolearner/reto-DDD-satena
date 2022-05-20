package pasajero;

import co.com.sofka.domain.generic.EventChange;
import pasajero.entities.Asiento;
import pasajero.entities.Equipaje;
import pasajero.entities.Reservacion;
import pasajero.events.*;
import pasajero.values.*;

public class PasajeroEventChange extends EventChange {
    public PasajeroEventChange(Pasajero pasajero) {

        apply((AsientoCambiado event)->{
            var numeroAsiento=event.getNumeroAsientoNuevo();
            var idAsiento=event.getIdAsiento();
            var estadoAsiento=new EstadoAsiento(EstadoAsiento.Estado.DISPONIBLE);
            pasajero.asiento=new Asiento(idAsiento);
            pasajero.asiento.assignarNumeroAsiento(numeroAsiento);
            pasajero.asiento.cambiarEstado(estadoAsiento);

        });

        apply((Checked event)->{
            var numeroAsiento=event.getNumeroAsiento();
            var peso=event.getPeso();
            var volumen=event.getVolumen();
            var descripcion =event.getDescripcion();
            var tipo=event.getTipo();
            var idEquipaje=event.getIdEquipaje();
            var estadoAsiento=new EstadoAsiento(EstadoAsiento.Estado.DISPONIBLE);

            pasajero.equipaje =new Equipaje(idEquipaje,peso, volumen, tipo,descripcion);
            pasajero.asiento=new Asiento(event.getIdAsiento());
            pasajero.asiento.assignarNumeroAsiento(numeroAsiento);
            pasajero.asiento.cambiarEstado(estadoAsiento);
            pasajero.check=new Check(true);
        });

        apply((ItinerarioCambiado event)->{
            pasajero.reservacion.cambiarItinerario(event.getItinerarioNuevo());
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
