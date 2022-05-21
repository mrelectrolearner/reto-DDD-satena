package tripulacion.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tripulacion.Tripulacion;
import tripulacion.commands.AgregarVueloCopiloto;

public class AgregarVueloCopilotoUseCase extends UseCase<RequestCommand<AgregarVueloCopiloto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarVueloCopiloto> agregarVueloCopilotoRequestCommand) {
        var command=agregarVueloCopilotoRequestCommand.getCommand();

        var idTripulacion=command.getIdTripulacion();
        var tripulacion= Tripulacion.from(idTripulacion,repository().getEventsBy(idTripulacion.value()));
        var idCopiloto=command.getIdCopiloto();
        var fecha=command.getFecha();

        tripulacion.agregarVuelo(idCopiloto,fecha);

        emit().onResponse(new ResponseEvents(tripulacion.getUncommittedChanges()));

    }
}
