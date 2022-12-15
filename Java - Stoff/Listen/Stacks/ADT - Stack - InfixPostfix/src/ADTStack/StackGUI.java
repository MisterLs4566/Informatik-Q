package ADTStack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StackGUI {
    private JPanel mainPanel;
    private JPanel stackPanel;
    private JPanel controlPanel;
    private JTextField tfInhalt;
    private JTextArea taStack;
    private JButton stackErzeugenButton;
    private JButton pushButton;
    private JButton popButton;
    private JButton peekButton;

    private Stack myStack;

    public StackGUI() {
        stackErzeugenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myStack = new Stack();
                ausgeben();
            }
        });
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfInhalt.getText();

                if (content != "") {
                    // Element erzeugen
                    ElementD newElement = new ElementD(content);

                    myStack.push(newElement);
                }

                ausgeben();
            }
        });
        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (myStack.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Stack ist leer!", "ACHTUNG!!!",
                            JOptionPane.OK_CANCEL_OPTION);
                } else {
                    ElementD current = myStack.pop();
                    JOptionPane.showMessageDialog(null, "Inhalt: " + current.getContent(),
                            "aktuelles Element",
                            JOptionPane.OK_CANCEL_OPTION);
                    ausgeben();
                }
            }
        });
        peekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (myStack.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Stack ist leer!", "ACHTUNG!!!",
                            JOptionPane.OK_CANCEL_OPTION);
                } else {
                    ElementD current = myStack.peek();
                    JOptionPane.showMessageDialog(null, "Inhalt: " + current.getContent(),
                            "aktuelles Element",
                            JOptionPane.OK_CANCEL_OPTION);
                }
            }
        });
    }

    // Inhalt der Elemente ausgeben
    public void ausgeben() {
        // Für die Ausgabe des Stack wird auf Methoden der Klasse Stack
        // zurückgegriffen, die nicht Standard sind
        if (!myStack.isEmpty()) {
            // Inhalt ausgeben
            myStack.first();

            taStack.setText(myStack.getCurrent().getContent() + "  <= Top of Stack\n");

            while (!myStack.isLast()) {
                myStack.next();
                taStack.append(myStack.getCurrent().getContent() + "\n");
            }
            taStack.append("===================\n");
        } else {
            taStack.setText("===================\n");
        }

        // zurücksetzen des Stack
        myStack.first();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StackGUI");
        frame.setContentPane(new StackGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}