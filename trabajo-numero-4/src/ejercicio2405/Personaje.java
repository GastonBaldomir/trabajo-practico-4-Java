package ejercicio2405;

public class Personaje {
    private String nombre;
    private String apellido;

    public Personaje(){};

    public Personaje(String nombre, String apellido){
        this.nombre= nombre;
        this.apellido= apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
