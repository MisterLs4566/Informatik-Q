package OOM.Gartenfirma2;

public class auftrag {
    private String auftragsArt;
    private int stundenAufwand;
    private String auftragsDatum;
    private boolean istErledigt;

    public String getAuftragsArt() {
        return auftragsArt;
    }

    public void setAuftragsArt(String auftragsArt) {
        this.auftragsArt = auftragsArt;
    }

    public int getStundenAufwand() {
        return stundenAufwand;
    }

    public void setStundenAufwand(int stundenAufwand) {
        this.stundenAufwand = stundenAufwand;
    }

    public String getAuftragsDatum() {
        return auftragsDatum;
    }

    public void setAuftragsDatum(String auftragsDatum) {
        this.auftragsDatum = auftragsDatum;
    }

    public boolean isIstErledigt() {
        return istErledigt;
    }

    public void setIstErledigt(boolean istErledigt) {
        this.istErledigt = istErledigt;
    }

    public auftrag(String auftragsArt, String auftragsDatum) {
        this.auftragsArt = auftragsArt;
        this.auftragsDatum = auftragsDatum;
        stundenAufwand = 0;
        istErledigt = false;
    }
}
