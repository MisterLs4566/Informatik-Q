package OOM.bib;

public class Buch {
    private String isbn, titel, autor, standort;
    public Buch(String isbn, String titel, String autor) {
        this.isbn = isbn;
        this.titel = titel;
        this.autor = autor;
        this.standort = "";
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public String toString() {
        return "titel: " + this.titel + " autor: " + this.autor;
    }
}
