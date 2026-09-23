package ejercicio2404;

import java.nio.DoubleBuffer;

public abstract class Figura {
    private String color;
    private Double area;
    private String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getArea() {
        return area;
    }
    public void pintar(String color){
        setColor(this.color);
        System.out.println("Pintando FIGURA COLOR " + color);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
