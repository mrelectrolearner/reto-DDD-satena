package tripulacion;

import co.com.sofka.domain.generic.EventChange;
import tripulacion.entities.Copiloto;
import tripulacion.entities.Piloto;
import tripulacion.entities.Sobrecargo;
import tripulacion.events.*;

import java.util.HashMap;

public class TripulacionEventChange extends EventChange {
    public TripulacionEventChange(Tripulacion tripulacion) {
        apply((TripulacionCreada event)->{
            var idPiloto=event.getIdPiloto();
            var idCopiloto=event.getIdCopiloto();
            var datosPiloto=event.getDatosCopiloto();
            var datosCopiloto=event.getDatosPiloto();
            tripulacion.piloto=new Piloto(idPiloto,datosPiloto);
            tripulacion.copiloto=new Copiloto(idCopiloto,datosCopiloto);
            tripulacion.sobrecargos=new HashMap<>();

        });

        apply((CopilotoCambiado event)->{
            var datosPersonales=event.getDatosPersonales();
            tripulacion.copiloto.cambiarDatosPersonales(datosPersonales);
        });

        apply((PilotoCambiado event)->{
            var datosPersonales=event.getDatosPersonales();
            tripulacion.piloto.cambiarDatosPersonales(datosPersonales);
        });

        apply((SobrecargoAgregado event)->{
            var idSobregargo=event.getIdSobrecargo();
            var datosPersonalesSobrecargo=event.getDatosPersonales();
            Sobrecargo sobrecargo=new Sobrecargo(idSobregargo,datosPersonalesSobrecargo);
            tripulacion.sobrecargos.put(idSobregargo,sobrecargo);
        });

        apply((SobrecargoEliminado event)->{
            var idSobrecargo=event.getIdSobrecargo();
            tripulacion.sobrecargos.remove(idSobrecargo);
        });

        apply((VueloAgregadoCopiloto event)->{
            var id=event.getIdCopiloto();
            var fecha=event.getFecha();
            tripulacion.copiloto.agregarVuelo(fecha);
        });

        apply((VueloAgregadoPiloto event)->{
            var id=event.getIdPiloto();
            var fecha=event.getFecha();
            tripulacion.piloto.agregarVuelo(fecha);
        });

        apply((VueloAgregadoSobrecargo event)->{
            var id =event.getIdSobrecargo();
            var fecha=event.getFecha();
            tripulacion.sobrecargos.get(id).agregarVuelo(fecha);
        });
    }
}
