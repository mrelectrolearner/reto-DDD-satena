package generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fecha implements ValueObject<LocalDate> {
    private LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public LocalDate value() {
        return fecha;
    }
}
