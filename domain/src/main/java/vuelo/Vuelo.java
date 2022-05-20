package vuelo;

import co.com.sofka.domain.generic.AggregateEvent;
import generics.values.*;
import pasajero.identities.IdPasajero;
import pasajero.identities.IdReserva;
import pasajero.values.Tarifa;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdPiloto;
import tripulacion.identities.IdSobrecargo;
import tripulacion.identities.IdTripulacion;
import vuelo.entities.Avion;
import vuelo.entities.Ruta;
import vuelo.identities.IdAvion;
import vuelo.identities.IdRuta;
import vuelo.identities.IdVuelo;
import vuelo.values.Capacidad;
import vuelo.values.Modelo;
import vuelo.values.Ubicacion;

import java.util.Set;
/*
public class Vuelo extends AggregateEvent<IdVuelo> {
    protected IdTripulacion idTripulacion;
    protected Avion avion;
    protected Set<IdPasajero> idPasajeros;
    protected Ruta ruta;



    public Vuelo(IdVuelo entityId, Origen origen, Destino destino, Llegada llegada, Salida salida) {
        super(entityId);
        appendChange(new vueloCreado(entityId, origen, destino,llegada, salida)).apply();
        subscribe(new VueloEventChange(this));
    }


    public void agregarAvion(IdAvion idAvion, Modelo modelo, Capacidad capacidad){
        appendChange(new AvionAgregado(idAvion,modelo,capacidad)).apply();
    }
    public void agregarPasajero(IdPasajero idPasajero,
                                DatosPersonales datosPersonales,
                                IdReserva idReserva,
                                Tarifa tarifa)
    {
        appendChange(new PasajeroAgregado(idPasajero,datosPersonales,idReserva,tarifa)).apply();
    }

    public void eliminarPasajero(IdPasajero idPasajero) {
        appendChange(new PasajeroEliminado(idPasajero)).apply();
    }

    public void cambiarRuta(CodigoVuelo codigoVuelo){
        appendChange(new CodigoVueloRutaCambiado(codigoVuelo)).apply();
    }

    public void cambiarRuta(Fecha fecha){
        appendChange(new FechaRutaCambiada(fecha)).apply();
    }

    public void cambiarRuta(Salida salida){
        appendChange(new SalidaRutaCambiada(salida)).apply();
    }

    public void cambiarRuta(Origen origen){
        appendChange(new OrigenRutaCambiado(origen)).apply();
    }

    public void cambiarRuta(Destino destino){
        appendChange(new DestinoRutaCambiada(destino)).apply();
    }

    public void cambiarRuta(Llegada llegada){
        appendChange(new LlegadaRutaCambiada(llegada)).apply();
    }

    public void agregarTripulacion(IdPiloto idPiloto,DatosPersonales datosPersonales){
        appendChange(new PilotoAgregadoDeVuelo(idPiloto,datosPersonales)).apply();

    }

    public void agregarTripulacion(IdCopiloto idCopiloto,DatosPersonales datosPersonales){
        appendChange(new CopilotoAgregadoDeVuelo(idCopiloto,datosPersonales)).apply();

    }

    public void agregarTripulacion(IdSobrecargo idSobrecargo,DatosPersonales datosPersonales){
        appendChange(new SobrecargoAgregadoDeVuelo(idSobrecargo,datosPersonales)).apply();
    }

    public void cambiarPiloto(IdPiloto idPilotoNuevo, DatosPersonales datosPersonalesNuevoPiloto){
        agregarTripulacion(idPilotoNuevo,datosPersonalesNuevoPiloto);
    }

    public void cambiarCopiloto(IdCopiloto idCopilotoNuevo, DatosPersonales datosPersonalesNuevoCopiloto){
        agregarTripulacion(idCopilotoNuevo,datosPersonalesNuevoCopiloto);
    }

    public void cambiarSobrecargo(IdSobrecargo idSobrecargoactual,IdSobrecargo idSobrecargoNuevo,DatosPersonales datosPersonalesSobrecargoNuevo){
        appendChange(new SobrecargoCambiadoDeVuelo(idSobrecargoactual,idSobrecargoNuevo,datosPersonalesSobrecargoNuevo)).apply();
    }

    public void elimnarSobrecargo(IdSobrecargo idSobrecargo){
        appendChange(new SobrecargoEliminadoDeVuelo(idSobrecargo)).apply();
    }

    public void modificarUbicacionAvion(IdRuta idRuta, Ubicacion ubicacion){
        appendChange(new UbicacionAvionModificada(idRuta,ubicacion)).apply();
    }



}
*/
