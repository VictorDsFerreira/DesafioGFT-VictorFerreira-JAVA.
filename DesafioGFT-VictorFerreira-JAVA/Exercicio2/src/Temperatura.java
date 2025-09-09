public class Temperatura {

    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;

    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperatura=" + temperatura +
                '}';
    }
}
