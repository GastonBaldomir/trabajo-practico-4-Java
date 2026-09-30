package ejercicio2403;

public class Reamur {
    private Double tempReamur;

    public Reamur() {
        this.tempReamur = 0.0;
    }

    public Reamur(Double tempReamur) {
        this.tempReamur = tempReamur;
    }

    public double getReamur() {
        return this.tempReamur;
    }

    public void setReamur(double temperatura) {
        this.tempReamur = temperatura;
    }

    public double convertirA(String targetScale) {
        Temperature conversion = new Temperature();
        return conversion.convertTemperature(this.tempReamur, "REAMUR", targetScale);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reamur{");
        sb.append("temperatura en Reamure: ").append(tempReamur);
        sb.append('}');
        return sb.toString();
    }
}
