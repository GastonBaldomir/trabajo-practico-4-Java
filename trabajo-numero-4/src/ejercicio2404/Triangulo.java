package ejercicio2404;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;


    public Triangulo(Double base, Double altura){
        this.base=base;
        this.altura=altura;
        super("Triangulo");
    }

    @Override
    public Double getArea() {
        return (base*altura) / 2;
    }
}
