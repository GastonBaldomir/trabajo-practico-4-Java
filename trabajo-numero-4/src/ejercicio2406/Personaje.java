package ejercicio2406;

import java.util.Objects;

public class Personaje extends Persona {
    private String rol;
    private String descripcion;

    public Personaje() {
        super();
    }

    public Personaje(String nacionalidad, String nombre, String apellido, String rol, String descripcion) {
        super(nacionalidad, nombre, apellido);
        this.rol = rol;
        this.descripcion = descripcion;
    }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + getNombre() + ('\n') +
                ", apellido='" + getApellido() + ('\n') +
                ", nacionalidad='" + getNacionalidad() + ('\n') +
                ", rol='" + rol + ('\n') +
                ", descripcion='" + descripcion + ('\n') +
                '}';
    }
}

