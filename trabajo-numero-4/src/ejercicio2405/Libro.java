package ejercicio2405;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private LocalDate fechaDePublicacion;
    private Integer cantidadDeCopias;
    private List<Personaje>personajes;

    public Libro(String titulo, String autor, LocalDate fechaDePublicacion, Integer cantidadDeCopias){
        this.titulo= titulo;
        this.autor=autor;
        this.fechaDePublicacion= fechaDePublicacion;
        this.cantidadDeCopias = cantidadDeCopias;
        personajes=new ArrayList<>();
    }
    public void agregarPersonajes(Personaje personaje){
        personajes.add(personaje);
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public void setCantidadDeCopias(Integer cantidadDeCopias) {
        this.cantidadDeCopias = cantidadDeCopias;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public Integer getCantidadDeCopias() {
        return cantidadDeCopias;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro{");
        sb.append("- titulo='").append(titulo).append('\n');
        sb.append("- autor='").append(autor).append('\n');
        sb.append("- fechaDePublicacion=").append(fechaDePublicacion).append('\n');
        sb.append("- cantidadDeCopias=").append(cantidadDeCopias).append('\n');
        sb.append("- personajes=").append(personajes).append('\n');
        sb.append('}');
        return sb.toString();
    }
}
