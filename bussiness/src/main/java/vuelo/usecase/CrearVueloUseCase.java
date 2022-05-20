package vuelo.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import generics.values.Itinerario;
import vuelo.Vuelo;
import vuelo.commands.CrearVuelo;
import vuelo.events.VueloCreado;
import vuelo.identities.IdVuelo;

public class CrearVueloUseCase extends UseCase<RequestCommand<CrearVuelo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearVuelo> crearVueloRequestCommand) {
        var command=crearVueloRequestCommand.getCommand();
        var idVuelo=command.getIdVuelo();
        var itinerario=command.getItinerario();
        var vuelo =new Vuelo(idVuelo,itinerario);
        emit().onResponse(new ResponseEvents(vuelo.getUncommittedChanges()));

    }
}
