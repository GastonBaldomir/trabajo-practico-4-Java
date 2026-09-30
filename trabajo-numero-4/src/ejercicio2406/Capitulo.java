package ejercicio2406;

import java.util.Objects;

public class Capitulo {
    private Integer numero;
    private Double duracion;
    private String titulo;

    public Capitulo(){};

    public Capitulo(String titulo, Integer numero, Double duracion) {
        this.titulo = titulo;
        this.numero = numero;
        this.duracion = duracion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder('\n' + "Capitulo{");
        sb.append("numero=").append(numero);
        sb.append(", duracion=").append(duracion);
        sb.append(", titulo='").append(titulo).append('\n');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Capitulo capitulo = (Capitulo) o;
        return Objects.equals(numero, capitulo.numero) && Objects.equals(duracion, capitulo.duracion) && Objects.equals(titulo, capitulo.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, duracion, titulo);
    }
}
