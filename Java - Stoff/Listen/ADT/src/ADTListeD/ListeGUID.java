package ADTListeD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListeGUID {

    private ListeD myListeD;

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

    public ListeGUID() {
        bCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListeD = new ListeD();
            }
        });
        bInsertBefore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfInhalt.getText();

                if (content != "") {
                    // Element erzeugen
                    ElementD newElementD = new ElementD(content);

                    myListeD.insertBefore(newElementD);
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
                    ElementD newElementD = new ElementD(content);

                    myListeD.insertBehind(newElementD);
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
                    ElementD newElementD = new ElementD(content);

                    myListeD.append(newElementD);
                }

                ausgeben();
            }
        });
        bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListeD.delete();
                ausgeben();
            }
        });
        bFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListeD.first();
                ausgeben();
            }
        });
        bPrevious.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListeD.previous();
                ausgeben();
            }
        });
        bNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListeD.next();
                ausgeben();
            }
        });
        bGetContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ElementD aElementD = myListeD.getCurrent();

                JOptionPane.showMessageDialog(null, "Inhalt: " + aElementD.getContent(),
                        "aktuelles Element", JOptionPane.OK_CANCEL_OPTION);
            }
        });
        bSetContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfInhalt.getText();

                if ((content != "") && (!myListeD.isEmpty())) {
                    myListeD.getCurrent().setContent(content);
                }

                ausgeben();
            }
        });
    }

    // Inhalt der Elemente ausgeben
    public void ausgeben() {
        if (!myListeD.isEmpty()) {
            // aktuellen Zeiger zwischenspeichern;
            ElementD current = myListeD.getCurrent();

            // Inhalt ausgeben
            myListeD.first();

            if (myListeD.getCurrent() == current) {
                taListe.setText(myListeD.getCurrent().getContent() + "  <= current\n");
            } else {
                taListe.setText(myListeD.getCurrent().getContent() + "\n");
            }

            while (!myListeD.isLast()) {
                myListeD.next();

                if (myListeD.getCurrent() == current) {
                    taListe.append(myListeD.getCurrent().getContent() + "  <= current\n");
                } else {
                    taListe.append(myListeD.getCurrent().getContent() + "\n");
                }
            }

            // aktuelles Element finden
            myListeD.first();

            while (myListeD.getCurrent() != current) {
                myListeD.next();
            }
        } else {
            taListe.setText("");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ADT Liste (doppelt verkettet)");
        frame.setContentPane(new ListeGUID().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
