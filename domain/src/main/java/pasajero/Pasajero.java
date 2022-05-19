package pasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.entities.Asiento;
import pasajero.entities.Equipaje;
import pasajero.entities.Reservacion;
import pasajero.events.*;
import pasajero.identities.IdPasajero;
import pasajero.identities.IdReserva;
import pasajero.values.Check;
import generics.values.DatosPersonales;
import pasajero.values.NumeroTicket;
import pasajero.values.TargetaDeEmbarque;
import pasajero.values.Tarifa;
import vuelo.Vuelo;

import java.util.List;

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

    public static Pasajero from(IdPasajero idPasajero, List<DomainEvent> events){
        var pasajero = new Pasajero(idPasajero);
        events.forEach(pasajero::applyEvent);
        return pasajero;
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
        appendChange(new Checked(equipaje,asiento)).apply();
    }

    public void generarTargetaDeEmbarque(Vuelo vuelo){
        Nombre nombre=datosPersonales.value().nombre();
        appendChange(new TargetaDeEmbarqueGenerada(nombre,vuelo,reservacion.itinerario(),numeroTicket,asiento)).apply();

    }

    public void reservar(IdReserva idReserva, Itinerario itinerario, Tarifa tarifa){
        appendChange(new VueloReservado(idReserva,itinerario,tarifa )).apply();
    }

    public void cambiarAsiento(Asiento nuevoAsiento){
        appendChange(new AsientoCambiado(nuevoAsiento)).apply();
    }

    public TargetaDeEmbarque targetaDeEmbarque() {
        return targetaDeEmbarque;
    }

    public NumeroTicket numeroTicket() {
        return numeroTicket;
    }

    public Check check() {
        return check;
    }

    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }

    public Equipaje equipaje() {
        return equipaje;
    }

    public Asiento asiento() {
        return asiento;
    }

    public Reservacion reservacion() {
        return reservacion;
    }
}
