package pasajero.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import pasajero.Pasajero;
import pasajero.commands.CrearPasajero;

public class CrearPasajeroUseCase extends UseCase<RequestCommand<CrearPasajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPasajero> crearPasajeroRequestCommand) {
        var command =crearPasajeroRequestCommand.getCommand();

        var pasajero=new Pasajero(
                command.getIdPasajero(),
                command.getDatosPersonales()
        );

        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));

    }
}
