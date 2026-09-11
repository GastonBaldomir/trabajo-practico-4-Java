package ejercicio2403;

public class Main {
    static void main() {
        Temperature obj1 = new Temperature();
        System.out.println(obj1.convertTemperature(10, "Fahrenheit", "reamur" ));
        System.out.println(obj1.convertTemperature(10, "kelvin", "rankine" ));
        System.out.println(obj1.convertTemperature(10, "rankine", "reamur" ));
    }
}
