package OOM.Punkte;

public class Punkt {
    private int posX, posY;

    public Punkt(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public String toString() {
        return "X=" + this.posX + " Y=" + this.posY;
    }

    public int abstandUrsprung() {
        return (int) Math.pow(Math.pow(this.posX, 2) - Math.pow(this.posY, 2), 0.5);
    }

    public Punkt spiegelungX() {
        int xNeu = posX;
        int yNeu = (int) posY*-1;
        return new Punkt(xNeu, yNeu);
    }

    public Punkt spiegelungY() {
        int yNeu = posY;
        int xNeu = (int) posX*-1;
        return new Punkt(xNeu, yNeu);
    }

    public Punkt spiegelungUrsprung(){
        int xNeu = (int) posX*-1;
        int yNeu = (int) posY*-1;
        return new Punkt(xNeu, yNeu);
    }
    public int abstandPunkt(Punkt pNeu) {
        return (int)(Math.pow(Math.pow(pNeu.posX - this.posX, 2) + Math.pow(pNeu.posY - this.posY, 2), 0.5));
    }

    public void setPosX(int x) {
        this.posX = x;
    }

    public void setPosY(int y) {
        this.posY = y;
    }
}
