package generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Fecha implements ValueObject<LocalDate> {
    private LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = Objects.requireNonNull(fecha);
    }

    @Override
    public LocalDate value() {
        return fecha;
    }
}
