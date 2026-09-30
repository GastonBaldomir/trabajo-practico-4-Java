package ejercicio2403;

public class Main {
    static void main() {
        Temperature obj1 = new Temperature();

        System.out.println(obj1.convertTemperature(10, "Fahrenheit", "reamur" ));
        System.out.println(obj1.convertTemperature(10, "reamur", "celsius" ));
        System.out.println(obj1.convertTemperature(10, "reamur", "kelvin" ));


        Rankine tempRankine = new Rankine(500.0);

        double enCelsius = tempRankine.convertirA("CELSIUS");
        double enKelvin = tempRankine.convertirA("KELVIN");

        System.out.println(tempRankine +" en Celsius es: " + enCelsius);
        System.out.println(tempRankine + " en Kelvin es: " + enKelvin);

        Reamur tempReamur = new Reamur(10.0);
        double aCelsius = tempReamur.convertirA("CELSIUS");
        double aKelvin = tempReamur.convertirA("KELVIN");
        System.out.println(tempReamur + "  en Celsius es: " + aCelsius);
        System.out.println(tempReamur + "  en Kelvin es: " + aKelvin);

    }
}
