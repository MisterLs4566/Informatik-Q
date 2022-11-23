package OOM.bib;

public class AppBibliothek {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.getBuecher();
        bibliothek.setBuch("12ß93481923845938948231984982319489328492384", "HELLO", "LINUS");
        bibliothek.getBuecher();
        bibliothek.setBuch("12ß93481923845938948231984982319489328492384", "HELLO", "LINUS");
        bibliothek.getBuecher();
        bibliothek.setBuch("12ß93481923845938948231984982319489328492384", "HELLO", "LINUS");
        bibliothek.getBuecher();

        bibliothek.removeBuch();
        bibliothek.getBuecher();
        bibliothek.setBuch("12ß93481923845938948231984982319489328492384", "HELLO", "LINUS");
        bibliothek.getBuecher();
        bibliothek.setBuch("12ß93481923845938948231984982319489328492384", "HELLO", "LINUS");
        bibliothek.getBuecher();
    }
}
