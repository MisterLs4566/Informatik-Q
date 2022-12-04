package Vererbung.Flugzeuge;

public abstract class Flugzeug {
    protected String hersteller;
    protected int maxSpeed;
    protected String immatNummer;
    protected int anzahlFluegel;

    public Flugzeug(String hersteller, int maxSpeed, String immatNummer, int anzahlFluegel) {
        this.hersteller = hersteller;
        this.maxSpeed = maxSpeed;
        this.immatNummer = immatNummer;
        this.anzahlFluegel = anzahlFluegel;
    }

    public String getImmatNummer() {
        return immatNummer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract boolean getLooping();

}
