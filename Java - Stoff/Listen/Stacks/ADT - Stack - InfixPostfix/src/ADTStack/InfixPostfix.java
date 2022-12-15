package ADTStack;

public class InfixPostfix {
   private Stack stackInfix, stackPostfix, stackHelp;

   //======================================================================= UMWANDLUNG INFIX => POSTFIX
   // Infixterm wird eingelesen (rückwärts)
   public void einlesenInfix(String term) {
       String[] s = term.split(" ");
       for (int i = s.length-1; i >= 0; i--) {
           stackInfix.push(new ElementD(s[i]));
       }
   }

    protected int prioritaet(String op) {
        if (String.valueOf(op).equals("+") || String.valueOf(op).equals("-")) {
            return 1;
        } else if (String.valueOf(op).equals("*") || String.valueOf(op).equals(":")) {
            return 2;
        } else {
            return -1;
        }
    }

   private void wandleInfixInPostfix() {
       while (!stackInfix.isEmpty()) {
            // ToS auslesen
           String s = String.valueOf(stackInfix.peek().getContent());
            // Test auf (positive) ganze Zahl oder Dezimalzahl
            if (s.matches("\\d+([.]{1}\\d+)?")) { // stellt der String eine Zahl dar
                // Operand direkt in StackPostfix verschieben
                stackPostfix.push(stackInfix.pop());
            } else { // s ist KEINE ZAHL
                if (s.equals("(")) {
                    //"{" direkt in stackHelp verschieben
                    stackHelp.push(stackInfix.pop());
                }
                else if (s.equals(")")) {
                    // alle Elemente von StackHelp in StackPostfix verschieben, bis "("
                    while(String.valueOf(stackHelp.peek().getContent()).equals("{")) {
                        stackPostfix.push(stackHelp.pop());
                    }

                    //Klammern in stackHelp und stackInfix löschen
                    stackInfix.pop();
                    stackHelp.pop();
                }
                else {
                    //s ist Operator
                    while(!stackHelp.isEmpty() &&
                            (prioritaet(String.valueOf(stackHelp.peek().getContent()))) >= prioritaet(String.valueOf(stackInfix.peek().getContent()))) {
                        stackPostfix.push(stackHelp.pop());
                    }

                    //Operator in stackHelp verschieben
                    stackHelp.push(stackInfix.pop());
                    }
                }

                // Falls stackHelp nicht leer, alles in stackPostfix verschieben
                while(!stackHelp.isEmpty()) {
                    stackPostfix.push(stackHelp.pop());
                }
            }
    }

    // Elemente von StackPostfix werden in Postfixterm umgewandelt
    private String wandleStackInPostfixterm() {
        String s = "";
        while (!stackPostfix.isEmpty()) {
            s = stackPostfix.pop().getContent() + " " + s;
        }
        return s;
    }

    // Infixterm mit Zahlen, Klammern und Operatoren
    // jeweils durch LEERZEICHEN getrennt
    public String inPostfix(String term) {
        stackHelp = new Stack();
        stackPostfix = new Stack();
        stackInfix = new Stack();

        // Term in StackInfix einlesen;
        einlesenInfix(term);
        // Term umwandeln
        wandleInfixInPostfix();
        // StackPostfix in Postfixterm umwandeln und zurückgeben
        return wandleStackInPostfixterm();
    }

    //======================================================================= BERECHNUNG DES WERTES
    // Berechnen des Wertes eines Postfixterms
    private void schiebeTermInStackPostfix(String term) {
        String[] s = term.split(" ");
        for (int i = s.length-1; i >= 0; i--) {
            stackPostfix.push(new ElementD(s[i]));
        }
    }

    private double berechneWert() {
        return 1;
    }

    public double berechneTerm(String term) {
        stackHelp = new Stack();
        stackPostfix = new Stack();

        schiebeTermInStackPostfix(term);
        return berechneWert();
    }

}
