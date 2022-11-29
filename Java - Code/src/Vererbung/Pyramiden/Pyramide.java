package Vererbung.Pyramiden;

public class Pyramide {
    protected int laenge;
    protected int hoehe;

    public Pyramide(int laenge, int hoehe) {
        this.laenge = laenge;
        this.hoehe = hoehe;
    }

    public int volumen() {
        return (int)((0.333) * (this.laenge * this.laenge) * this.hoehe);
    }

    public int oberflaeche() {
        return (int) ((laenge * laenge) * 4 * (0.5 * laenge * hoehe));
    }
}
