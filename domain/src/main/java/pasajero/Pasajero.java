package pasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import generics.values.Itinerario;
import generics.values.Nombre;
import pasajero.entities.Asiento;
import pasajero.entities.Equipaje;
import pasajero.entities.Reservacion;
import pasajero.events.*;
import pasajero.identities.IdAsiento;
import pasajero.identities.IdEquipaje;
import pasajero.identities.IdPasajero;
import pasajero.identities.IdReserva;
import pasajero.values.*;
import generics.values.DatosPersonales;
import vuelo.identities.IdVuelo;

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
        subscribe(new PasajeroEventChange(this));
    }

    public static Pasajero from(IdPasajero idPasajero, List<DomainEvent> events){
        var pasajero = new Pasajero(idPasajero);
        events.forEach(pasajero::applyEvent);
        return pasajero;
    }


    public void cambiarItinerario(Itinerario itinerarioNuevo){
        appendChange(new ItinerarioCambiado(itinerarioNuevo)).apply();
    }

    public void checkIn(IdEquipaje idEquipaje, Peso peso, Volumen volumen, Tipo tipo,
                        Descripcion descripcion, NumeroAsiento numeroAsiento, IdAsiento idAsiento)
    {
        appendChange(new Checked(this.entityId, idEquipaje,peso, volumen, tipo, descripcion,numeroAsiento, idAsiento)).apply();
    }

    public void generarTargetaDeEmbarque(IdVuelo idVuelo){
        Nombre nombre=datosPersonales.value().nombre();
        Itinerario itinerario=this.reservacion.itinerario();
        NumeroAsiento numeroAsiento=this.asiento.getNumero();
        appendChange(new TargetaDeEmbarqueGenerada(this.entityId, nombre, idVuelo,
                itinerario,numeroTicket,numeroAsiento)).apply();

    }

    public void reservar(IdReserva idReserva, Itinerario itinerario, Tarifa tarifa){
        appendChange(new VueloReservado(idReserva,itinerario,tarifa )).apply();
    }

    public void cambiarAsiento(NumeroAsiento numeroAsiento, IdAsiento idAsiento){
        appendChange(new AsientoCambiado(numeroAsiento, idAsiento)).apply();
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
