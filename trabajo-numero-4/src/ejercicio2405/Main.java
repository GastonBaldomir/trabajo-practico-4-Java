package ejercicio2405;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    static void main(){
        Personaje personaje1 = new Personaje("Dardo","Fuseneco");
        Personaje personaje2 = new Personaje("Pepe", "Argento");
        Personaje personaje3 = new Personaje("Juan", "Soto");
        Personaje personaje4 = new Personaje("Helena","Wrhitght");

        Libro libro1 = new Libro("C.c.Hijos","Robert", LocalDate.now(),8);
        libro1.agregarPersonajes(personaje1);
        libro1.agregarPersonajes(personaje2);
        System.out.println("lista de personajes de un libro" + libro1.getPersonajes());
        Biblioteca colleccionDeLibros = new Biblioteca();

        System.out.println(colleccionDeLibros.getListaDeLibros());
        colleccionDeLibros.agregarLibro(libro1);
        Libro libro2 = new Libro("Un libro mas", "Baldomir Gaston", LocalDate.now(), 5);
        colleccionDeLibros.agregarLibro(libro2);
        System.out.println("Listado de Libros: " + '\n' + colleccionDeLibros.getListaDeLibros());
        System.out.println("Cantidad de libros: " + colleccionDeLibros.getCantidadLibros());
        System.out.println("Cantidad De Copias Totales: " + colleccionDeLibros.getCantidadDeCopias());
    }
}
