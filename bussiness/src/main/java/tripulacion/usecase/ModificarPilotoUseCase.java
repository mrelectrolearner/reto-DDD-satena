package tripulacion.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tripulacion.Tripulacion;
import tripulacion.commands.ModificarPiloto;
import tripulacion.identities.IdTripulacion;

public class ModificarPilotoUseCase extends UseCase<RequestCommand<ModificarPiloto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarPiloto> cambiarPilotoRequestCommand) {
        var command=cambiarPilotoRequestCommand.getCommand();
        IdTripulacion idTripulacion=command.getIdTripulacion();
        var tripulacion= Tripulacion.from(idTripulacion,repository().getEventsBy(command.getIdTripulacion().value()));

        tripulacion.modificarPiloto(command.getDatosPersonales());

        emit().onResponse(new ResponseEvents(tripulacion.getUncommittedChanges()));
    }
}
