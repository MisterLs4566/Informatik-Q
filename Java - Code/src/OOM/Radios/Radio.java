package OOM.Radios;

public class Radio {
    private boolean istAn;
    private int lautstaerke;
    private double frequenz;
    public Radio() {
        this.istAn = false;
        this.lautstaerke = 0;
        this.frequenz = 0;
    }

    public Radio(boolean eingeschaltet, int lautstaerke, double frequenz) {
        this.istAn = eingeschaltet;
        this.lautstaerke = lautstaerke;
        this.frequenz = frequenz;
    }

    public void lauter() {
        if(this.lautstaerke <= 10 && (this.istAn == true)) {
            this.lautstaerke++;
            System.out.println("Radio wurde lauter gestellt");
        }
        else {
            System.out.println("Radio konnte nicht lauter gestellt werden");
        }
    }

    public void leiser() {
        if(this.lautstaerke >= 0) {
            this.lautstaerke--;
            System.out.println("Radio wurde leiser gestellt");
        }
        else {
            System.out.println("Radio konnte nicht leiser gestellt werden");
        }
    }

    public void an() {
        this.istAn = true;

        System.out.println("Radio ist an");
    }

    public void aus() {
        this.istAn = false;

        System.out.println("Radio ist aus");
    }

    public String toString() {
        return "Freq=" + this.frequenz + " laut=" + this.lautstaerke;
    }

    public void waehleSender(double frequenz) {
        if(this.istAn == false) {
            System.out.println("Radio ist nicht eingeschaltet");
            return;
        }
        this.frequenz = frequenz;
        if(((frequenz<=110) && (frequenz>=85.0)) == false) {
            System.out.println("Eingegebene Frequenz außerhalb des zugelassenen Bereiches");
            this.frequenz = 99.9;
        }
        System.out.println("Frequenz wurde auf " + this.frequenz + " gestellt");
    }
}
