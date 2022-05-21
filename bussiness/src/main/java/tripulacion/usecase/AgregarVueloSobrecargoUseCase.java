package tripulacion.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import tripulacion.Tripulacion;
import tripulacion.commands.AgregarVueloSobrecargo;

public class AgregarVueloSobrecargoUseCase extends UseCase<RequestCommand<AgregarVueloSobrecargo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarVueloSobrecargo> agregarVueloSobrecargoRequestCommand) {
        var command=agregarVueloSobrecargoRequestCommand.getCommand();
        var idTripulacion=command.getIdTripulacion();
        var tripulacion= Tripulacion.from(idTripulacion,repository().getEventsBy(idTripulacion.value()));
        var idSobrecargo =command.getIdSobrecargo();
        var fecha=command.getFecha();

        tripulacion.agregarVuelo(idSobrecargo,fecha);

        emit().onResponse(new ResponseEvents(tripulacion.getUncommittedChanges()));

    }
}
