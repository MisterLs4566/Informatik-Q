package Vererbung.Pyramiden;
import java.lang.Math;

public class Tetraeder extends Pyramide{
    protected int laenge;
    protected int hoehe;

    public Tetraeder(int laenge, int hoehe) {
        super(laenge, hoehe);
    }
    @Override
    public int volumen() {
        return (int) ((Math.pow(2, 0.5)/12) * Math.pow(laenge, 3));
    }

    @Override
    public int oberflaeche() {
        return (int) (Math.pow(3, 0.333) * Math.pow(laenge, 2));
    }
}
