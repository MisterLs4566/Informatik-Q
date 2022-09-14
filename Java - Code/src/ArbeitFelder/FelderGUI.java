package ArbeitFelder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FelderGUI {
    private JLabel header;
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton buttonFill;
    private JTextField textField8;
    private JTextField selectField;
    private JTextField [] textFelder = new JTextField[12];
    private int[] feld = new int[7];
    int anzElemente = 0;
    int maxELemente = 7;
    //__init__(
    //constructor()
    public FelderGUI() {
        textFelder[0] = textField1;
        textFelder[1] = textField2;
        textFelder[2] = textField3;
        textFelder[3] = textField4;
        textFelder[4] = textField5;
        textFelder[5] = textField6;
        textFelder[6] = textField7;

        textFelder[6].setText("HUHHUUWUIODNHUHAUDUAWHIDHOWAD");
        buttonFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillArrays();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FelderGUI");
        frame.setContentPane(new FelderGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public int einlesen() {
        return Integer.valueOf(selectField.getText());
    }

    public void ausgeben() {
        for (int i = 0; i <maxELemente; i++) {
            textFelder[i].setText(Integer.toString(feld[i]));
        }
    }

    public void fillArrays() {
        // Zahl einlesen

        //Feld füllen

        //Feld ausgeben
    }
}
