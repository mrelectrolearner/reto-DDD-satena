package pasajero.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import pasajero.Pasajero;
import pasajero.events.TargetaDeEmbarqueGenerada;

public class TargetaDeEmbarqueGeneradaUseCase extends UseCase<TriggeredEvent<TargetaDeEmbarqueGenerada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<TargetaDeEmbarqueGenerada> targetaDeEmbarqueGeneradaTriggeredEvent) {
        var event=targetaDeEmbarqueGeneradaTriggeredEvent.getDomainEvent();
        var idPasajero=event.getIdPasajero();
        var pasajero= Pasajero.from(
                idPasajero,
                repository().getEventsBy(idPasajero.value())
        );
        pasajero.generarTargetaDeEmbarque(event.getIdVuelo());

        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));

    }
}
