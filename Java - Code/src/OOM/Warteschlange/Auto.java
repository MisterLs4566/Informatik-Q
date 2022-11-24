package OOM.Warteschlange;

public class Auto {
    private String kennzeichen;
    private int programm;

    public Auto(String kennzeichen, int programm) {
        this.kennzeichen = kennzeichen;
        this.programm = programm;
    }

    public String getKennzeichen() {
        return this.kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getProgramm() {
        return this.programm;
    }

    public void setProgramm(int programm) {
        this.programm = programm;
    }

    public String toString() {
        return "kennzeichen: " + this.kennzeichen + " programm: " + this.programm;
    }
}
