package ejercicio2406;

import ejercicio2402.Foto;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titulo;
    private Director director;
    private List<Personaje>listadoDePersonajes;
    private List<Capitulo>listadoDeCapitulos;
    private List<Actor>listadoDeActores;

    public Serie(String titulo, Director director) {
        this.titulo = titulo;
        this.director = director;
        this.listadoDePersonajes = new ArrayList<>();
        this.listadoDeCapitulos = new ArrayList<>();
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
    public void agregarCapitulo(Capitulo capitulo){listadoDeCapitulos.add(capitulo);}
    public void agregarActor(Actor actor){listadoDeActores.add(actor);}

    public void eliminarPersonaje(Personaje personaje){this.listadoDePersonajes.remove(personaje);}
    public void eliminarCapitulo(Capitulo capitulo){this.listadoDeCapitulos.remove(capitulo);}
    public void eliminarActor(Actor actor){this.listadoDeActores.remove(actor);}

    public List<Personaje> getListadoDePersonajes() {
        return listadoDePersonajes;
    }

    public List<Actor> getListadoDeActores() {
        return listadoDeActores;
    }

    public List<Capitulo> getListadoDeCapitulos() {
        return listadoDeCapitulos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Serie{");
        sb.append("titulo='").append(titulo).append('\n');
        sb.append(", director=").append(director).append('\n');
        sb.append(", listadoDePersonajes=").append(listadoDePersonajes).append('\n');
        sb.append(", listadoDeCapitulos=").append(listadoDeCapitulos).append('\n');
        sb.append(", listadoDeActores=").append(listadoDeActores).append('\n');
        sb.append('}');
        return sb.toString();
    }
}
