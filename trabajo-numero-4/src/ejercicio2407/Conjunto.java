package ejercicio2407;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
    private Set<Persona> listado;

    public Conjunto() {
        this.listado = new HashSet<>();
    }
    public void add(Persona persona) {
       this.listado.add(persona);
    }
    public void remove(Persona persona){
        this.listado.remove(persona);
    };
    public Conjunto union(Conjunto otro) {
        Conjunto resultado = new Conjunto();
        resultado.listado.addAll(this.listado); // Agrega lo de A
        resultado.listado.addAll(otro.listado); // Agrega lo de B
        return resultado;
    }
    public Conjunto interseccion(Conjunto otro) {
        Conjunto resultado = new Conjunto();

        resultado.listado.addAll(this.listado);
        resultado.listado.retainAll(otro.listado);
        return resultado;
    }
    public Conjunto diferencia(Conjunto otro) {
        Conjunto resultado = new Conjunto();

        resultado.listado.addAll(this.listado);
        resultado.listado.removeAll(otro.listado);
        return resultado;
    }
    public Conjunto diferenciaSimetrica(Conjunto otro) {
        Conjunto conj1 = this.diferencia(otro);
        Conjunto conj2 = otro.diferencia(this);
        Conjunto resultado = conj1.union(conj2);
        return resultado;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conjunto{");
        sb.append("listado=").append(listado);
        sb.append('}');
        return sb.toString();
    }
}
