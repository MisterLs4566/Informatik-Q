package FelderGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFelder {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JButton btnNew;
    private JButton btnFill;
    private JButton btnAppend;
    private JButton btnSearch;
    private JButton btnDelete;
    private JTextField tfZahl;
    private JButton btnEnd;

    private JTextField[] textFelder = new JTextField[15];
    int[] feld = new int[15];
    int anzElemente = 0;
    int maxAnzahl = 15;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Arbeit mit Feldern");
        frame.setContentPane(new GUIFelder().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public GUIFelder() {
        textFelder[0] = textField1;
        textFelder[1] = textField2;
        textFelder[2] = textField3;
        textFelder[3] = textField4;
        textFelder[4] = textField5;
        textFelder[5] = textField6;
        textFelder[6] = textField7;
        textFelder[7] = textField8;
        textFelder[8] = textField9;
        textFelder[9] = textField10;
        textFelder[10] = textField11;
        textFelder[11] = textField12;
        textFelder[12] = textField13;
        textFelder[13] = textField14;
        textFelder[14] = textField15;
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzElemente = 0;
                ausgeben();
            }
        });
        btnFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fuelleFelder();
            }
        });
        btnAppend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ergaenzeWert();
            }
        });
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sucheWert();
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loescheWert();
            }
        });
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    // Einlesen eines Wertes
    public int eingeben() {
        try {
            return Integer.parseInt(tfZahl.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Gib eine vernünftige Zahl ein.");
            return -1;
        }
    }

    // Ausgabe der Werte in die Textfelder; Farben zurücksetzen
    private void ausgeben() {
        for (int i = 0; i < anzElemente; i++) {
            textFelder[i].setText(String.valueOf(feld[i]));
            textFelder[i].setBackground(Color.white);
        }

        // Rest des Feldes löschen
        for (int i = anzElemente; i < maxAnzahl; i++) {
            textFelder[i].setText("");
            textFelder[i].setBackground(Color.white);
        }
    }

    // Füllen einer gewünschten Anzahl von Feldern
    private void fuelleFelder() {
        int neueAnzahl = eingeben();

        // Abbruch, falls ungültige Eingabe
        if ((neueAnzahl < 0) || (neueAnzahl > maxAnzahl)) return;

        anzElemente = neueAnzahl;
        for (int i = 0; i < anzElemente; i++) {
            feld[i] = (int) (100 * Math.random() +1);
        }

        ausgeben();
    }

    // ein Wert an Feld anhängen
    private void ergaenzeWert() {
        int neueZahl = eingeben();

        if (neueZahl == -1) return;

        if (anzElemente < maxAnzahl) {
            feld[anzElemente] = neueZahl;
            anzElemente++;
        }

        ausgeben();
    }

    // Suchen: Test, ob gewünschte Zahl im Feld vorhanden ist - Färbungen
    public void sucheWert() {
        int suchZahl = eingeben();

        if (suchZahl == -1) return;

        for (int i = 0; i < anzElemente; i++) {
            if (feld[i] == suchZahl) {
                textFelder[i].setBackground(Color.green);
            } else {
                textFelder[i].setBackground(Color.red);
            }
        }
    }

    // Löschen: alle gewünschten Werte werden aus dem Feld gelöscht
    public void loescheWert() {
        int suchZahl = eingeben();

        if (suchZahl == -1) return;

        int i = 0;
        while (i < anzElemente) {
            if (feld[i] == suchZahl) {
                for (int j = i + 1; j < anzElemente; j++) {
                    feld[j - 1] = feld[j];
                }
                anzElemente--;
                i--;
            }
            i++;
        }

        ausgeben();
    }
}
