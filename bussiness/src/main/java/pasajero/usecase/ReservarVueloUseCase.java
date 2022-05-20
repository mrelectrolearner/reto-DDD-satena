package pasajero.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import pasajero.Pasajero;
import pasajero.commands.ReservarVuelo;
import pasajero.entities.Reservacion;

public class ReservarVueloUseCase extends UseCase<RequestCommand<pasajero.commands.ReservarVuelo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<pasajero.commands.ReservarVuelo> reservarVueloRequestCommand) {
        var command=reservarVueloRequestCommand.getCommand();
        var pasajero=Pasajero.from(command.getIdPasajero(),repository().getEventsBy(command.getIdPasajero().value()));
        pasajero.reservar(
                command.getIdReserva(),
                command.getItinerario(),
                command.getTarifa()
        );
        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));

    }
}
