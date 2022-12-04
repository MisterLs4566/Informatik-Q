package Vererbung.Flugzeuge;

public class Verkehrsflugzeug extends Flugzeug {
    protected int anzahlPassagiere;

    public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, int anzahlPassagiere) {
        //constructor von höher gestellten Klasse (mit Argumenten) abfragen
        super(hersteller, maxSpeed, immatNummer, 2);
        this.anzahlPassagiere = anzahlPassagiere;
    }

    @Override
    public boolean getLooping() {
        return false;
    }

    public int getAnzahlPassagiere() {
        return this.anzahlPassagiere;
    }

    public void setAnzahlPassagiere(int anzahlPassagiere) {
        this.anzahlPassagiere = anzahlPassagiere;
    }

}
