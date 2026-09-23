package ejercicio2404;

public class Main {
    static void main() {
        Figura cuadrado1 = new Cuadrado(5.0);
        cuadrado1.setColor("Rojo");
        System.out.println("Area de cuadrado:" + cuadrado1.getArea());
        System.out.println(cuadrado1.getColor());
        Figura rect = new Rectangulo(2.0,5.0, "RECTANGULO");
        rect.setColor("Verde");
        System.out.println(rect.getArea());
        System.out.println(rect.getColor());
        rect.pintar("rojo");

        EditorDeFiguras editor = new EditorDeFiguras();
        editor.agregarFigura(cuadrado1);
        editor.agregarFigura(rect);
        System.out.println(editor.getFiguras().toString());
        editor.pintar("celeste");
        System.out.println(rect.getColor());
        System.out.println(cuadrado1.getColor());
        System.out.println(editor.calcularArea());
    }
}