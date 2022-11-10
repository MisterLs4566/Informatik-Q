package OOM.Aquarien;
import java.lang.Math;

public class Aquarium {
    private double temp, zielTemp;

    public Aquarium(double temp, double zielTemp) {
        this.temp = temp;
        this.zielTemp = zielTemp;
        this.status();
    }

    public void status() {
        System.out.println("Status: Eingeschaltet. Soll: " + this.zielTemp + "°C. Überwachung läuft.");
        this.tempCheck();
    }

    public void tempCheck() {
        System.out.println("Status: Soll: " + this.zielTemp + "°C. Ist: " + this.temp + "°C.");
        if(this.temp == this.zielTemp) {
            System.out.println("Die richtige Temperatur wurde erreicht");
        }
        else {
            if(this.temp<this.zielTemp) {
                System.out.println("-> Achtung: zu kalt! Heizung an.\nLampe an.");
                tempErhoehen();
            };
            if(this.temp>this.zielTemp) {
                System.out.println("-> Achtung: zu heiß! Heizung aus.\nLampe an.");
                tempVerringern();
            }
        }
    }

    public void tempErhoehen() {
        this.temp *= 100;
        this.temp = Math.round(this.temp + 10);
        this.temp /= 100;
        tempCheck();
    }

    public void tempVerringern() {
        this.temp *= 100;
        this.temp = Math.round(this.temp - 10);
        this.temp /= 100;
        tempCheck();
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
