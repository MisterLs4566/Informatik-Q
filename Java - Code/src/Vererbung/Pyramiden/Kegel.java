package Vererbung.Pyramiden;
import java.lang.Math;

public class Kegel extends Pyramide{
    protected int laenge;
    protected int hoehe;

    public Kegel(int laenge, int hoehe) {
        super(laenge, hoehe);
    }

    @Override
    public int volumen() {
        return (int) ((0.333) * Math.PI * Math.pow(laenge / 2, 2) * hoehe);
    }

    @Override
    public int oberflaeche() {
        return (int)(Math.PI * Math.pow(laenge / 2, 2) + Math.PI * laenge / 2 * Math.pow(Math.pow(laenge / 2, 2) + Math.pow(hoehe, 2), 0.5));
    }
}
