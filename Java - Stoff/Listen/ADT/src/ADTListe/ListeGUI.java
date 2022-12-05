package ADTListe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListeGUI {

    private Liste myListe;

    private JPanel mainPanel;
    private JPanel btnPanel;
    private JPanel viewPanel;
    private JTextField tfInhalt;
    private JTextArea taListe;
    private JButton bCreate;
    private JButton bInsertBefore;
    private JButton bInsertBehind;
    private JButton bAppend;
    private JButton bDelete;
    private JButton bFirst;
    private JButton bPrevious;
    private JButton bNext;
    private JButton bLast;
    private JButton bGetContent;
    private JButton bSetContent;

    public ListeGUI() {
        bCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListe = new Liste();
            }
        });
        bInsertBefore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfInhalt.getText();

                if (content != "") {
                    // Element erzeugen
                    Element newElement = new Element(content);

                    myListe.insertBefore(newElement);
                }

                ausgeben();
            }
        });
        bInsertBehind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfInhalt.getText();

                if (content != "") {
                    // Element erzeugen
                    Element newElement = new Element(content);

                    myListe.insertBehind(newElement);
                }

                ausgeben();
            }
        });
        bAppend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfInhalt.getText();

                if (content != "") {
                    // Element erzeugen
                    Element newElement = new Element(content);

                    myListe.append(newElement);
                }

                ausgeben();
            }
        });
        bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListe.delete();
                ausgeben();
            }
        });
        bFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListe.first();
                ausgeben();
            }
        });
        bPrevious.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListe.previous();
                ausgeben();
            }
        });
        bNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListe.next();
                ausgeben();
            }
        });
        bGetContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Element aElement = myListe.getCurrent();

                JOptionPane.showMessageDialog(null, "Inhalt: " + aElement.getContent(),
                        "aktuelles Element", JOptionPane.OK_CANCEL_OPTION);
            }
        });
        bSetContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfInhalt.getText();

                if ((content != "") && (!myListe.isEmpty())) {
                    myListe.getCurrent().setContent(content);
                }

                ausgeben();
            }
        });
    }

    // Inhalt der Elemente ausgeben
    public void ausgeben() {
        if (!myListe.isEmpty()) {
            // aktuellen Zeiger zwischenspeichern;
            Element current = myListe.getCurrent();

            // Inhalt ausgeben
            myListe.first();

            if (myListe.getCurrent() == current) {
                taListe.setText(myListe.getCurrent().getContent() + "  <= current\n");
            } else {
                taListe.setText(myListe.getCurrent().getContent() + "\n");
            }

            while (!myListe.isLast()) {
                myListe.next();

                if (myListe.getCurrent() == current) {
                    taListe.append(myListe.getCurrent().getContent() + "  <= current\n");
                } else {
                    taListe.append(myListe.getCurrent().getContent() + "\n");
                }
            }

            // aktuelles Element finden
            myListe.first();

            while (myListe.getCurrent() != current) {
                myListe.next();
            }
        } else {
            taListe.setText("");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ADT Liste (einfach verkettet)");
        frame.setContentPane(new ListeGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
