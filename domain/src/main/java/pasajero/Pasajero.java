package pasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.entities.Asiento;
import pasajero.entities.Equipaje;
import pasajero.entities.Reservacion;
import pasajero.events.*;
import pasajero.identities.IdPasajero;
import pasajero.values.Check;
import generics.values.DatosPersonales;
import pasajero.values.NumeroTicket;
import pasajero.values.TargetaDeEmbarque;
import pasajero.values.Tarifa;

public class Pasajero extends AggregateEvent<IdPasajero> {
    protected TargetaDeEmbarque targetaDeEmbarque;
    protected NumeroTicket numeroTicket;
    protected Check check;
    protected DatosPersonales datosPersonales;
    protected Equipaje equipaje;
    protected Asiento asiento;
    protected Reservacion reservacion;

    public Pasajero(IdPasajero entityId) {
        super(entityId);
        subscribe(new PasajeroEventChange(this));
    }

    public Pasajero(IdPasajero entityId, DatosPersonales datosPersonales) {
        super(entityId);
        appendChange(new PasajeroCreado(datosPersonales)).apply();
    }

    public void AgregarItinerario(Itinerario itinerario){
        appendChange(new ItinerarioAgregado(itinerario)).apply();
    }

    public void eliminarItinerario(Itinerario itinerario){
        appendChange(new ItinerarioEliminado(itinerario)).apply();
    }

    public void cambiarItinerario(Itinerario itinerarioActual,Itinerario itinerarioNuevo){
        appendChange(new ItinerarioCambiado(itinerarioActual,itinerarioNuevo)).apply();
    }

    public void checkIn(Equipaje equipaje, Asiento asiento){
        appendChange(new Ckecked(equipaje,asiento)).apply();
    }

    public void generarTargetaDeEmbarque(){
        Nombre nombre=datosPersonales.value().nombre();
        appendChange(new TargetaDeEmbarqueGenerada(nombre,numeroTicket,asiento)).apply();

    }

    public void reservar(Itinerario itinerario, Tarifa tarifa){
        appendChange(new VueloReservado(itinerario,tarifa)).apply();
    }

    public void cambiarAsiento(Asiento nuevoAsiento){
        appendChange(new AsientoCambiado(this.asiento,nuevoAsiento)).apply();
    }


}
