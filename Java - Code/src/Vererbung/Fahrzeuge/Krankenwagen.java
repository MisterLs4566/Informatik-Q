package Vererbung.Fahrzeuge;

public class Krankenwagen extends Auto{
    protected boolean lichtAn;
    public Krankenwagen() {
        super();
        lichtAn = false;
    }

    public void umschalten() {
        this.lichtAn = !this.lichtAn;
    }

    public String toString() {
        return  "Fahrzeug [anzRad=" + anzRad + ", v=" + v + ", maxV=" + maxV + ", pos=" + pos + ", lichtAn=" + lichtAn + "]";
    }
}
