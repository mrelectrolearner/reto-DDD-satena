package generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class DatosPersonales implements ValueObject<DatosPersonales.Pros> {
    private Nombre nombre;
    private Telefono telefono;
    private Correo correo;

    @Override
    public DatosPersonales.Pros value() {
        return new Pros() {
            @Override
            public Nombre nombre() {
                return nombre;
            }

            @Override
            public Telefono telefono() {
                return telefono;
            }

            @Override
            public Correo correo() {
                return correo;
            }
        };
    }

    public interface Pros {
        Nombre nombre();
        Telefono telefono();
        Correo correo();

    }
}
