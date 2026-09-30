package ejercicio2406;

import java.util.Objects;

public class Actor extends Persona{

    public Actor() {
        super();
    }

    public Actor(String nacionalidad, String nombre, String apellido) {
        super(nacionalidad, nombre, apellido);
    }

    @Override
    public String toString() {
        return "Actor{nombre='" + getNombre() + "', apellido='" + getApellido() + "'}";
    }

}


