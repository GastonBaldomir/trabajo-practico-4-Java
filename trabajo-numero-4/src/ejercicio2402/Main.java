package ejercicio2402;

import java.util.List;

public class Main {
  static void main() {
      AlbumFoto albumNuevo = new AlbumFoto("AlbumCreado");
      Foto foto1 = new Foto(1, "cielo");
      Foto foto2 = new Foto(2,"cascada");
      Foto foto3 = new Foto(3,"playa");

      albumNuevo.agregarFoto(foto1);
      System.out.println(" Contenido del Álbum ");
      for (Foto f : albumNuevo.getFotos()) {
        System.out.println("ID: " + f.getId() + " - Descripción: " + f.getDescripcion());
      }
      List<Foto> nuevasFotos = List.of(foto2, foto3);
      albumNuevo.agregarColeccionFotos(nuevasFotos);

      System.out.println(" Contenido del Álbum ");
      for (Foto f : albumNuevo.getFotos()) {
          System.out.println("Id: " + f.getId() + " - Descripción: " + f.getDescripcion());
      }
    }
  }
