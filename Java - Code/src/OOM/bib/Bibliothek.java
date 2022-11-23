package OOM.bib;

public class Bibliothek {
    private String name, adresse;
    private Buch[] buecher;
    int anzahlBuecher;

    public Bibliothek() {
        this.name = "";
        this.adresse = "";
        this.buecher = new Buch[10];
        this.anzahlBuecher = 0;
    }

    public void setBuch(String isbn, String titel, String autor) {
        Buch buch = new Buch(isbn, titel, autor);
        this.buecher[this.anzahlBuecher] = buch;
        this.anzahlBuecher++;
    }

    public void getBuecher() {
        for(int i = 0; i < buecher.length; i++) {
            System.out.println(i + " : " + buecher[i]);
        }
    }

    public void removeBuch() {
        buecher[this.anzahlBuecher - 1] = null;
        this.anzahlBuecher--;
    }
}
