package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISumme {
    private JLabel Header;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel mainPanel;
    private JButton buttonCalc;
    private JLabel labelResult;

    public GUISumme() {
        buttonCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Summanden einlesen
                if(textField1.getText().length() != 0 && textField2.getText().length() != 0) {
                    int s1 = Integer.valueOf(textField1.getText());
                    int s2 = Integer.valueOf(textField2.getText());
                    //Summe berechnen
                    int summe = s1+s2;
                    //Ergebnis eingeben
                    labelResult.setText(String.valueOf(summe));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUISumme");
        frame.setContentPane(new GUISumme().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
