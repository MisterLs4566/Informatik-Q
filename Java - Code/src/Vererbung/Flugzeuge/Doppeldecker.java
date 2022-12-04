package Vererbung.Flugzeuge;

public class Doppeldecker extends Flugzeug {
    private double loopingSpeed;
    private boolean offenesCockpit;

    public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
        //constructor von höher gestellten Klasse (mit Argumenten) abfragen
        super(hersteller, maxSpeed, immatNummer, 2);
        this.offenesCockpit = offenesCockpit;
        this.loopingSpeed = 360;
    }

    public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
        //constructor von höher gestellten Klasse (mit Argumenten) abfragen
        super(hersteller, maxSpeed, immatNummer, 2);
        this.offenesCockpit = true;
        this.loopingSpeed = 360;
    }

    @Override
    public boolean getLooping() {
        if(maxSpeed > this.loopingSpeed) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean getOffenesCockpit() {
        return offenesCockpit;
    }

}
