package ejercicio2407;

public class Main {
    static void main(){
        Persona p1 = new Persona("Lionel", "Messi", "30123456");
        Persona p2 = new Persona("Angel", "Di Maria", "32987654");
        Persona p3 = new Persona("Rodrigo", "De Paul", "38456123");
        Persona p4 = new Persona("Emiliano", "Martinez", "35111222");
        Persona p5 = new Persona("Lautaro", "Martinez", "40333444");
        Persona p6 = new Persona("Julian", "Alvarez", "42555666");

        Conjunto conjuntoA = new Conjunto();
        Conjunto conjuntoB = new Conjunto();
        Conjunto conjuntoC = new Conjunto();
        conjuntoA.add(p1);
        conjuntoA.add(p2);
        conjuntoA.add(p3);

        conjuntoB.add(p3);
        conjuntoB.add(p4);
        conjuntoB.add(p5);
        conjuntoB.add(p6);

       conjuntoC.add(p2);
       conjuntoC.add(p6);

        System.out.println("Diferencia");
        System.out.println(conjuntoA.diferencia(conjuntoC));
        System.out.println("Union");
        System.out.println(conjuntoC.union(conjuntoB));
        System.out.println("Interseccion");
        System.out.println(conjuntoB.interseccion(conjuntoA));
        System.out.println("DiferenciaSimetrica");
        System.out.println(conjuntoC.diferenciaSimetrica(conjuntoA));
    }
}