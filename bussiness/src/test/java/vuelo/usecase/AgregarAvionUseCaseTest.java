package vuelo.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import vuelo.commands.AgregarAvion;
import vuelo.events.AvionAgregado;
import vuelo.events.VueloCreado;
import vuelo.identities.IdAvion;
import vuelo.identities.IdVuelo;
import vuelo.values.Capacidad;
import vuelo.values.Modelo;
import java.util.List;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarAvionUseCaseTest {
    @InjectMocks
    AgregarAvionUseCase agregarAvionUseCase;

    @Mock
    DomainEventRepository repository;

    @Test
    void agregarAvionHappyTest(){
        //arrange
        var idVuelo=IdVuelo.of("xx");
        var idAvion=IdAvion.of("dd");
        var modelo=new Modelo("boind777");
        var capacidad=new Capacidad(700D);
        var command=new AgregarAvion(idVuelo,idAvion,modelo,capacidad);

        when(repository.getEventsBy("xx")).thenReturn(history());
        agregarAvionUseCase.addRepository(repository);

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(agregarAvionUseCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var avionAgregado=(AvionAgregado)events.get(0);

        //assert
        Assertions.assertEquals(idAvion,avionAgregado.getIdAvion());
        Assertions.assertEquals(capacidad,avionAgregado.getCapacidad());
        Assertions.assertEquals(modelo,avionAgregado.getModelo());
    }

    private List<DomainEvent> history() {
        var vueloCreado=new VueloCreado();
        return List.of(vueloCreado);

    }

}