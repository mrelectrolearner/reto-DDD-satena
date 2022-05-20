package vuelo.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import vuelo.Vuelo;
import vuelo.commands.AgregarAvion;
import vuelo.identities.IdVuelo;

public class AgregarAvionUseCase extends UseCase<RequestCommand<AgregarAvion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarAvion> agregarAvionRequestCommand) {
        var command=agregarAvionRequestCommand.getCommand();
        var idAvion=command.getIdAvion();
        var capacidad=command.getCapacidad();
        var modelo=command.getModelo();
        var idVuelo=command.getIdVuelo();
        var vuelo = Vuelo.from(idVuelo,repository().getEventsBy(command.getIdVuelo().value()));

        vuelo.agregarAvion(
                idAvion,
                modelo,
                capacidad
        );

        emit().onResponse(new ResponseEvents(vuelo.getUncommittedChanges()));

    }
}
