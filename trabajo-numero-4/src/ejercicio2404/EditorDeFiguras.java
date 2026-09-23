package ejercicio2404;

import ejercicio2402.Foto;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class EditorDeFiguras {
    private List<Figura> listaDeFiguras;

    public EditorDeFiguras(){
        this.listaDeFiguras = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return listaDeFiguras;
    }

    public void pintar(String color){
        for (int i = 0; i < listaDeFiguras.size(); i++) {
            Figura figura = listaDeFiguras.get(i);
            figura.setColor(color);
        }
    }
    public Double calcularArea(){
        Double areaTotal = 0.0;
        for (int i = 0; i < listaDeFiguras.size(); i++) {
            Figura figura = listaDeFiguras.get(i);
            areaTotal = areaTotal + figura.getArea();
        }
        return areaTotal;
    }
    public void agregarFigura(Figura figura){
        this.listaDeFiguras.add(figura);
    }
    public void eliminarFigura(Figura figura){
        this.listaDeFiguras.remove(figura);
    }
}
