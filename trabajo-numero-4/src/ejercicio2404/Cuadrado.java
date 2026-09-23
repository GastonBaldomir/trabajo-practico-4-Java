package ejercicio2404;

public class Cuadrado extends Rectangulo {

    private Double lado;


    public Cuadrado(Double lado) {
        this.lado = lado;
        super(2.0, 2.0, "Cuadrado");

    }
    @Override
    public Double getArea(){
        return lado*lado;
    }
}
