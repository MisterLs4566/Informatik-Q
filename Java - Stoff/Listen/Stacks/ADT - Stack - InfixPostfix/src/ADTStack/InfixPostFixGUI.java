package ADTStack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfixPostFixGUI {
    private JPanel mainPanel;
    private JTextField tfInfixTerm;
    private JButton formeUmButton;
    private JTextField tfPostfixTerm;
    private JButton berechneWertButton;
    private JTextField tfWert;

    private InfixPostfix myInfixPostfix = new InfixPostfix();

    public InfixPostFixGUI() {
        formeUmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPostfixTerm.setText(myInfixPostfix.inPostfix(tfInfixTerm.getText()));
            }
        });
        berechneWertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfWert.setText(String.valueOf(myInfixPostfix.berechneTerm(tfPostfixTerm.getText())));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("InfixPostFixGUI");
        frame.setContentPane(new InfixPostFixGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
