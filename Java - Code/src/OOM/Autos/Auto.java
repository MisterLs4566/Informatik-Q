package OOM.Autos;

public class Auto {
    private String kennzeichen;
    private double kmStand, tankvolumen, verbrauch, kmMenge;

    public Auto() {
        this.kennzeichen = "";
        this.kmStand = 0;
        this.verbrauch = 0;
        this.kmMenge = 0;
        this.tankvolumen = 0;
    }

    public Auto(String kennzeichen, double tankvolumen, double verbrauch) {
        this.kennzeichen = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
        this.kmStand = 0;
        this.verbrauch = verbrauch;
        this.kmMenge = 0;
        this.tankvolumen = tankvolumen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public double getKmStand() {
        return kmStand;
    }

    public double getTankvolumen() {
        return tankvolumen;
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public double getKmMenge() {
        return kmMenge;
    }

    public void tanken (double menge) {
        if(this.kmMenge + menge <= this.tankvolumen) {
            this.kmMenge += menge;
        }
        else {
            System.out.println("Zu viel Menge angegeben");
        }
    }
}
