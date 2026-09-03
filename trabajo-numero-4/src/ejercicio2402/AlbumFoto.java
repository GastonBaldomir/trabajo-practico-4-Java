package ejercicio2402;

import java.util.List;
import java.util.ArrayList;
public class AlbumFoto {
    private String nombre;
    private List<Foto> fotos;

    public AlbumFoto(String nombre) {
        this.nombre = nombre;
        this.fotos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Foto> getFotos() {
        return this.fotos;
    }

    public void agregarFoto(Foto foto){
        this.fotos.add(foto);
    }
    public void eliminarFoto(Foto foto){
        this.fotos.remove(foto);
    }
    public void agregarColeccionFotos(List<Foto> nuevasFotos) {
        this.fotos.addAll(nuevasFotos);
    }
    public void eliminarMuchasFotos(List<Foto> fotosABorrar) {
        this.fotos.removeAll(fotosABorrar);
    }
}
