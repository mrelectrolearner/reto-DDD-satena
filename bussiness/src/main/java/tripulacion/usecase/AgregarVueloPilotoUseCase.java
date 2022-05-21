package tripulacion.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import generics.values.Fecha;
import tripulacion.Tripulacion;
import tripulacion.commands.AgregarVueloPiloto;
import tripulacion.identities.IdCopiloto;
import tripulacion.identities.IdTripulacion;

public class AgregarVueloPilotoUseCase extends UseCase<RequestCommand<AgregarVueloPiloto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarVueloPiloto> agregarVueloPilotoRequestCommand) {
        var command=agregarVueloPilotoRequestCommand.getCommand();

        var idTripulacion=command.getIdTripulacion();
        var tripulacion= Tripulacion.from(idTripulacion,repository().getEventsBy(idTripulacion.value()));
        var idPiloto=command.getIdPiloto();
        var fecha=command.getFecha();

        tripulacion.agregarVuelo(idPiloto,fecha);

        emit().onResponse(new ResponseEvents(tripulacion.getUncommittedChanges()));

    }
}
