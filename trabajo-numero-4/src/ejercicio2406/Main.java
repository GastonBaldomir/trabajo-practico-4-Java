package ejercicio2406;

import java.util.List;

public class Main {
    static void main() {
        Personaje personaje1 = new Personaje("Noruego","Ragnar","Lodbrok","Protegonista","Vikingo protagonista de la serie");
        Personaje personaje2 = new Personaje("Danes","Harald","Gormsson","Villano","Rey de Dinamarca");
        Director director1 = new Director("Aleman","David", "Horushell");
        Actor actor1 = new Actor("Argentina","Rodrigo","DeLaSerna");
        Actor actor2 = new Actor("Español","Jaime","Lorenteno");
        Capitulo cap1 = new Capitulo("Desembarco en Normandia",1,60.55);
        Serie vikingos = new Serie("Vikings",director1);
        vikingos.agregarActor(actor1);
        vikingos.agregarActor(actor2);
        vikingos.agregarCapitulo(cap1);
        vikingos.agregarPersonajes(personaje1);
        vikingos.agregarPersonajes(personaje2);
        System.out.println(vikingos);

    }
}
