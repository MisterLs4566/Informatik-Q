package OOM.Patienten;

public class Patient {
    String name;
    String versicherung;
    int alter;
    String[] vorerkrankungen;
    String bemerkungen;

    String naechsterTermin;
    String beschwerde;

    public Patient(String name) {
        this.name = name;
    }

    public Patient(String name, String versicherung, int alter, String[] vorerkrankungen, String bemerkungen){
        this.name = name;
        this.versicherung = versicherung;
        this.alter = alter;
        this.vorerkrankungen = vorerkrankungen;
        this.bemerkungen = bemerkungen;
        this.naechsterTermin = "";
    }

    public void terminAusmachen(String termin) {
        this.naechsterTermin = termin;
        System.out.println("Der nächste Termin: " + naechsterTermin + " wurde eingetragen.");
    }

    public void beschwerde(String beschwerde) {
        this.beschwerde = beschwerde;
        System.out.println("Ihre Beschwerde wurde vermerkt.");
    }

    public String getName() {
        return name;
    }

    public String getVersicherung() {
        return versicherung;
    }

    public int getAlter() {
        return alter;
    }

    public String[] getVorerkrankungen() {
        return vorerkrankungen;
    }

    public String getBemerkungen() {
        return bemerkungen;
    }
}
