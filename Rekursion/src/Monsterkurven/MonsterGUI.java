package Monsterkurven;

import je.util.Turtle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonsterGUI {

    private int x, y, ordnung;
    private double laenge;

    private Turtle myTurtle = new Turtle();

    private JPanel mainPanel;
    private JPanel turtlePanel;
    private JPanel controlPanel;
    private JComboBox cbKurve;
    private JSpinner sOrdnung;
    private JTextField tfLaenge;
    private JTextField tfX;
    private JTextField tfY;
    private JButton kurveZeichnenButton;
    private JButton flächeLöschenButton;

    public MonsterGUI() {
        // Turtlefläche zuweisen
        myTurtle.setBounds(0, 0, 500, 500);
        myTurtle.setBackground(Color.WHITE);
        myTurtle.setOrigin(250, 250);
        turtlePanel.add(myTurtle);
        // Combobox füllen
        String[] cbItems = {
                "Schneeflocke", "Schneeflocke II",
                "AB Kurve 1", "AB Kurve 2", "AB Kurve 3", "AB Kurve 4", "AB Kurve 5",
                "Pythagorasbaum", "Sierpinski-Dreiecke"
        };
        for (String s: cbItems) cbKurve.addItem(s);

        kurveZeichnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Werte zurücksetzen und neu einlesen
                myTurtle.turnto(0);
                x = Integer.parseInt(tfX.getText());
                y = Integer.parseInt(tfY.getText());
                myTurtle.moveto(x,y);
                ordnung = Integer.parseInt(sOrdnung.getValue().toString());
                laenge = Integer.parseInt(tfLaenge.getText());
                // Kurven zeichnen
                switch (cbKurve.getSelectedIndex()) {
                    case 0:
                        drawSchneeflocke(ordnung, laenge);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                }
            }
        });
        flächeLöschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myTurtle.clear();
            }
        });
    }

    public void drawSchneeflocke(int n, double l) {
        if(n==0) {
            myTurtle.draw(l);
        }
        else if(n==1) {
            myTurtle.draw(l/3);
            myTurtle.turn(60);
            myTurtle.draw(l/3);
            myTurtle.turn(-120);
            myTurtle.draw(l/3);
            myTurtle.turn(60);
            myTurtle.draw(l/3);
        }
        else {
            drawSchneeflocke(n-1, l);
            myTurtle.turn(60);
            drawSchneeflocke(n-1, l);
            myTurtle.turn(-120);
            drawSchneeflocke(n-1, l);
            myTurtle.turn(60);
            drawSchneeflocke(n-1, l);
        }
    }

    public void drawKurve1(int ordnung, double laenge) {
    }

    public void drawKurve2(int sgn, int ordnung, double laenge) {
    }

    public void drawKurve3(int ordnung, double laenge) {
    }

    public void drawKurve4(int sgn, int ordnung, double laenge) {
    }

    public void drawKurve5(int ordnung, double laenge) {
    }

    public void drawPythagoras(int ordnung, double laenge) {
    }

    public void drawSierpinski(int ordnung, double laenge) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphische Rekursion - Monsterkurven");
        frame.setContentPane(new MonsterGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
