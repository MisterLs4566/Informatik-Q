package Vererbung.Fahrzeuge;

public abstract class Fahrzeug {
    protected int anzRad;
    protected double v;  //Geschwindigkeit in km/h
    protected double maxV;
    protected double pos;  //Strecke vom Start in km

    public Fahrzeug() {
        this.anzRad = 0;
        this.v = 0;
        this.maxV = 0;
        this.pos = 0;
    }

    public void bewege(double min) {
        pos = pos + min/60 * v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getMaxV() {
        return maxV;
    }

    public String toString() {
        return "Fahrzeug [anzRad=" + anzRad + ", v=" + v + ", maxV=" + maxV + ", pos=" + pos + "]";
    }
}
