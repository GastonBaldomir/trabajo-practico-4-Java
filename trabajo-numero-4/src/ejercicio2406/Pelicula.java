package ejercicio2406;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pelicula {
    private String titulo;
    private Director director;
    private List<Personaje> listadoDePersonajes;
    private List<Actor>listadoDeActores;

    public Pelicula(String titulo, Director director) {
        this.titulo = titulo;
        this.director = director;
        this.listadoDePersonajes = new ArrayList<>();
        this.listadoDeActores = new ArrayList<>();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    public void agregarPersonajes( Personaje personaje){
        listadoDePersonajes.add(personaje);
    }
    public void agregarActor(Actor actor){listadoDeActores.add(actor);}

    public void eliminarPersonaje(Personaje personaje){this.listadoDePersonajes.remove(personaje);}
    public void eliminarActor(Actor actor){this.listadoDeActores.remove(actor);}

    public List<Personaje> getListadoDePersonajes() {
        return listadoDePersonajes;
    }

    public List<Actor> getListadoDeActores() {
        return listadoDeActores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pelicula{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", director=").append(director);
        sb.append(", listadoDePersonajes=").append(listadoDePersonajes);
        sb.append(", listadoDeActores=").append(listadoDeActores);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo) && Objects.equals(director, pelicula.director) && Objects.equals(listadoDePersonajes, pelicula.listadoDePersonajes) && Objects.equals(listadoDeActores, pelicula.listadoDeActores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director, listadoDePersonajes, listadoDeActores);
    }
}
