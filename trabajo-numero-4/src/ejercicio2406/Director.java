package ejercicio2406;

import java.util.Objects;

public class Director extends Persona{
   public Director(){
       super();
   }
    public Director(String nacionalidad, String nombre, String apellido) {
        super(nacionalidad, nombre, apellido);
    }

    @Override
    public String toString() {
        return "Director{nombre='" + getNombre() + "', apellido='" + getApellido() + "'}";
    }
}
