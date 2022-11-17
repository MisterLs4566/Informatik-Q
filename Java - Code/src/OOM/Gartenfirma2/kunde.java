package OOM.Gartenfirma2;


public class kunde {
    private int kundenNummer;
    private String name;
    private String wohnOrt;
    private auftrag einAuftrag;
    private auftrag[] auftraege;
    private int anzAuftraege;

    public kunde(int kundenNummer, String name) {
        this.kundenNummer = kundenNummer;
        this.name = name;
        this.wohnOrt = "";
        this.auftraege = new auftrag[10];
        this.anzAuftraege = 0;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public int getAnzAuftraege() {
        return anzAuftraege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWohnOrt() {
        return wohnOrt;
    }

    public void setWohnOrt(String wohnOrt) {
        this.wohnOrt = wohnOrt;
    }

    public void setEinAuftrag(auftrag einAuftrag) {
        if(anzAuftraege < 10) {
            this.auftraege[anzAuftraege] = einAuftrag;
            this.anzAuftraege ++;
        }else {
            System.out.println("Schon zu viele Aufträge :/");
        }

    }

    public auftrag getEinAuftrag(int nr) {
        if(nr <= this.anzAuftraege) {
            return this.auftraege[nr-1];
        } else {
            return null;
        }
    }

    public void removeAuftrag() {
        this.einAuftrag = null;
    }

    public String auftragAusgeben() {
        return this.einAuftrag.getAuftragsArt();
    }
}
