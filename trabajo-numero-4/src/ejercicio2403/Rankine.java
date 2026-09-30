package ejercicio2403;

public class Rankine {
    private Double tempRankine;


    public Rankine() {
        this.tempRankine = 0.0;
    }

    public Rankine(Double tempRankine) {
        this.tempRankine = tempRankine;
    }

    public double getRankine() {
        return this.tempRankine;
    }

    public void setRankine(double temperatura) {
        this.tempRankine = temperatura;
    }


    public double convertirA(String targetScale) {
        Temperature conversion = new Temperature();

        return conversion.convertTemperature(this.tempRankine, "RANKINE", targetScale);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rankine{");
        sb.append("temperatura en Rankine: ").append(tempRankine);
        sb.append('}');
        return sb.toString();
    }
}

