package OOM.Gartenfirma;

public class AppGarten {
    public static void main(String[] args) {
        kunde aKunde = new kunde(1234, "Ich");
        auftrag aAuftrag = new auftrag("Rasen mähen", "heute");
        System.out.println(aKunde.getName());
        aKunde.setEinAuftrag(aAuftrag);
        System.out.println(aKunde.auftragAusgeben());
    }
}
