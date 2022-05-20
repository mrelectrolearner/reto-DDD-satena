package pasajero.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import pasajero.Pasajero;
import pasajero.commands.CambiarAsiento;

public class CambiarAsientoUseCase extends UseCase<RequestCommand<CambiarAsiento>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarAsiento> cambiarAsientoRequestCommand) {
        var command=cambiarAsientoRequestCommand.getCommand();

        var pasajero= Pasajero.from(
                command.getIdPasajero(),
                repository().getEventsBy(command.getIdPasajero().value())
        );

       pasajero.cambiarAsiento(
                command.getNumeroAsientoAsientoNuevo(),
                command.getIdAsiento()
        );

       emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));


    }
}
