package OOM.Gartenfirma2;


public class AppGarten {
    public static void main(String[] args) {
        auftrag aAuftrag;
        kunde aKunde;

        aKunde = new kunde(1234, "Ich");
        aAuftrag = new auftrag("Rasen mähen", "heute");
        System.out.println(aKunde.getName());
        aKunde.setEinAuftrag(aAuftrag);
        System.out.println(aKunde.auftragAusgeben());


        aAuftrag = new auftrag("Blümchen schneiden", "morgen");
        aKunde.setEinAuftrag(aAuftrag);

        for(int i=1; i<=aKunde.getAnzAuftraege(); i++){

        }
    }
}
