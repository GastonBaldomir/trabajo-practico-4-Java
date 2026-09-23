package ejercicio2404;

public class Linea extends Figura{
    private Double longitud;


    public Linea(Double longitud){
        super("Linea");
        this.longitud= longitud;
    }

    @Override
    public Double getArea() {
        return 0.0;
    }
}
