package pasajero.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import pasajero.Pasajero;
import pasajero.events.Checked;
import pasajero.identities.IdPasajero;

public class CheckInUseCase extends UseCase<TriggeredEvent<Checked>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<Checked> checkedTriggeredEvent) {
        var event=checkedTriggeredEvent.getDomainEvent();
        var idPasajero=event.getIdPasajero();
        var pasajero= Pasajero.from(
                idPasajero,
                repository().getEventsBy(idPasajero.value())
        );

        pasajero.checkIn(
                event.getIdEquipaje(),
                event.getPeso(),
                event.getVolumen(),
                event.getTipo(),
                event.getDescripcion(),
                event.getNumeroAsiento(),
                event.getIdAsiento()
        );

        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));

    }
}
