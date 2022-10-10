package GraphRekursion;

import je.util.Turtle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpiraleGUI {

    private int startlaenge, endlaenge, winkel, zuwachs;
    private JPanel mainPanel;
    private JPanel turtlePanel;
    private JPanel controlPanel;
    private JTextField tfWinkel;
    private JTextField tfZuwachs;
    private JTextField tfEnde;
    private JTextField tfStart;
    private JButton spiraleRekursivZeichenButton;
    private JButton spiraleIterativZeichnenButton;

    private Turtle myTurtle = new Turtle();

    public SpiraleGUI() {
        // Turtlefläche zuweisen
        myTurtle.setBounds(0, 0, 300, 300);
        myTurtle.setBackground(Color.WHITE);
        myTurtle.setOrigin(150, 150);
        turtlePanel.add(myTurtle);
        spiraleRekursivZeichenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fläche säubern
                myTurtle.clear();
                myTurtle.moveto(0,0);
                myTurtle.turnto(0);
                // Parameter einlesen
                startlaenge = Integer.valueOf(tfStart.getText());
                endlaenge = Integer.valueOf(tfEnde.getText());
                zuwachs = Integer.valueOf(tfZuwachs.getText());
                winkel = Integer.valueOf(tfWinkel.getText());
                // Zeichnen
                spiraleRekursiv(startlaenge,endlaenge,zuwachs,winkel);
            }
        });
        spiraleIterativZeichnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fläche säubern
                myTurtle.clear();
                myTurtle.moveto(0,0);
                myTurtle.turnto(0);
                // Parameter einlesen
                startlaenge = Integer.valueOf(tfStart.getText());
                endlaenge = Integer.valueOf(tfEnde.getText());
                zuwachs = Integer.valueOf(tfZuwachs.getText());
                winkel = Integer.valueOf(tfWinkel.getText());
                // Zeichnen
                spiraleIterativ(startlaenge,endlaenge,zuwachs,winkel);
            }
        });
    }

    // Spirale rekursiv zeichnen
    public void spiraleRekursiv(int s, int e, int z, int w) {
        if(s<=e) {
            myTurtle.draw(s);
            myTurtle.turn(w);
            myTurtle.draw(s);
            myTurtle.turn(w);
            spiraleRekursiv(s + z, e, z, w);
        }
        else {
            return;
        }
    }

    // Spirale iterativ zeichnen
    public void spiraleIterativ(int s, int e, int z, int w) {
        for(int i=s; i<=e; i+=zuwachs) {
            myTurtle.draw(i);
            myTurtle.turn(w);
            myTurtle.draw(i);
            myTurtle.turn(w);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zeichnen einer Spirale");
        frame.setContentPane(new SpiraleGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
