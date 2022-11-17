package OOM.Gartenfirma;

public class kunde {
    private int kundenNummer;
    private String name;
    private String wohnOrt;
    private auftrag einAuftrag;

    public kunde(int kundenNummer, String name) {
        this.kundenNummer = kundenNummer;
        this.name = name;
        this.wohnOrt = "";
        this.einAuftrag = null;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
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
        this.einAuftrag = einAuftrag;
    }

    public auftrag getEinAuftrag() {
        return this.einAuftrag;
    }

    public void removeAuftrag() {
        this.einAuftrag = null;
    }

    public String auftragAusgeben() {
        return this.einAuftrag.getAuftragsArt();
    }
}
