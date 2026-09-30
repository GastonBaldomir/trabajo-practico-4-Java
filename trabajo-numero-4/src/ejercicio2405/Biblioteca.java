package ejercicio2405;

import ejercicio2402.Foto;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro>listaDeLibros;

    public Biblioteca(){
        this.listaDeLibros= new ArrayList<>();
    }

    public List<Libro> getListaDeLibros() {
        return listaDeLibros;
    }

    public void agregarLibro(Libro libro){
        this.listaDeLibros.add(libro);
    }
    public void eliminarFoto(Libro libro){
        this.listaDeLibros.remove(libro);
    }

    public Integer getCantidadLibros(){
        return listaDeLibros.size();
    }

    public Integer getCantidadDeCopias(){
        Integer cantidadTotalCopias=0;
        for(int i=0; i < listaDeLibros.size(); i++){
            cantidadTotalCopias += listaDeLibros.get(i).getCantidadDeCopias();
        }
        return cantidadTotalCopias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Biblioteca{");
        sb.append("listaDeLibros=").append(listaDeLibros);
        sb.append('}');
        return sb.toString();
    }
}
