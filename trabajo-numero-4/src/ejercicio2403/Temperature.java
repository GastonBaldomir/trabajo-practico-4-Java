package ejercicio2403;

public class Temperature {
    private Double tempInicialC;

    public Temperature() {
        tempInicialC = 0.0;
    }

    public Temperature(Double tempInicialC) {
        this.tempInicialC = tempInicialC;
    }

    public double getCelsius() {
        return this.tempInicialC;
    }

    void setCelsius(double temperatura) {
        tempInicialC = temperatura;
    }

    public double getFahrenheit() {
        double tempFahrenheit = (tempInicialC * 1.8) + 32;
        return tempFahrenheit;
    }

    public void setFahrenheit(double temperatura) {
        tempInicialC = (temperatura - 32) / 1.8;
    }

    public void setKelvin(double temperatura) {
        double tempFahrenheit = (temperatura - 273.15) * 1.8 + 32;
        this.tempInicialC = (tempFahrenheit - 32) / 1.8;
    }

    public double getKelvin() {
        double fahrenheit = (this.tempInicialC * 1.8) + 32;
        double kelvin = (fahrenheit - 32) / 1.8 + 273.15;
        return kelvin;
    }

    public double getRankine() {
        double tempRankine = (tempInicialC * 9 / 5) + 491.67;
        return tempRankine;
    }

    void setRankine(double temperatura) {
        tempInicialC = (temperatura - 491.67) * 5 / 9;
    }

    public double getReamur() {
        double tempFahrenheit = (tempInicialC * 1.8) + 32;
        double tempReamur = (tempFahrenheit - 32) / 2.25;
        return tempReamur;
    }

    void setReamur(double temperatura) {
        tempInicialC = temperatura * 1.25;
    }

    public double convertTemperature(double temperatura, String scale, String targetScale) {
        Temperature obj = new Temperature();

        if (scale.toUpperCase().equals("CELSIUS")) {
            obj.setCelsius(temperatura);
        } else if (scale.toUpperCase().equals("KELVIN")) {
            obj.setKelvin(temperatura);
        } else if (scale.toUpperCase().equals("FAHRENHEIT")) {
            obj.setFahrenheit(temperatura);
        } else if (scale.toUpperCase().equals("REAMUR")) {
            obj.setReamur(temperatura);
        } else if (scale.toUpperCase().equals("RANKINE")) {
            obj.setRankine(temperatura);
        }

        if (targetScale.toUpperCase().equals("CELSIUS")) {
            return obj.getCelsius();
        } else if (targetScale.toUpperCase().equals("KELVIN")) {
            return obj.getKelvin();
        } else if (targetScale.toUpperCase().equals("FAHRENHEIT")) {
            return obj.getFahrenheit();
        } else if (targetScale.toUpperCase().equals("REAMUR")) {
            return obj.getReamur();
        } else if (targetScale.toUpperCase().equals("RANKINE")) {
            return obj.getRankine();
        }
        else {
            System.out.println("Error: Escala de destino incorrecta.");
            return -999;
        }
    }
}
