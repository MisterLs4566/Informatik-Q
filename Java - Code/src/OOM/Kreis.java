package OOM;

public class Kreis {
    int radius, x1, y1;
    public Kreis(int x1, int y1, int radius) {
        this.radius = radius;
        this.x1 = x1;
        this.y1 = y1;
    }

    public String toString() {
        return "x1: " + this.x1 + " y1: " + this.y1 + " radius: " + this.radius;
    }

    public int flaeche() {
        float pi = (float) Math.PI;
        return (int) (pi * Math.pow(this.radius, 2));
    }

    public int radius() {
        return this.radius;
    }

    public String mittelpunkt() {
        return "x1: " + this.x1 + " y1: " + this.y1;
    }

    public char schneidet(Kreis kreis2) {
        int radiusSumme = (int) this.radius * kreis2.radius;
        int distanceX = (int) this.x1 - kreis2.x1;
        if(Math.pow((x1*x1) + (y1 * y1), 0.5f) < radiusSumme) {
            return 'j';}
        return 'n';
    }
}
