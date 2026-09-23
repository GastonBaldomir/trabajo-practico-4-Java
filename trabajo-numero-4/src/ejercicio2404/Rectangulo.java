package ejercicio2404;

public class Rectangulo extends Figura {

    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura, String nombre){
        this.base= base;
        this.altura= altura;
       super(nombre);
    }
    @Override
    public Double getArea() {
        return base*altura;
    }
}
