package tripulacion.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tripulacion.Tripulacion;
import tripulacion.commands.CrearTripulacion;

public class CrearTripulacionUseCase extends UseCase<RequestCommand<CrearTripulacion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTripulacion> crearTripulacionRequestCommand) {
        var command=crearTripulacionRequestCommand.getCommand();

        var idTripulacion=command.getIdTripulacion();
        var datosPersonales=command.getDatosPersonales();
        var idPiloto=command.getIdPiloto();
        var tripulacion=new Tripulacion(idTripulacion,datosPersonales,idPiloto);

        emit().onResponse(new ResponseEvents(tripulacion.getUncommittedChanges()));


    }
}
