package ArrayManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayForm2 {
    private JPanel mainPanel;
    private JLabel Header;
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
    private JButton newButton;
    private JButton fillButton;
    private JButton insertButton;
    private JButton searchButton;
    private JButton deleteButton;
    private JButton exitButton;
    private JTextField selectField;

    public JTextField[] arrayFields = new JTextField[14];
    public int inputArray[] = new int[14];
    public String action = "";

    public ArrayForm2() {

        arrayFields[0] = textField1;
        arrayFields[1] = textField2;
        arrayFields[2] = textField3;
        arrayFields[3] = textField4;
        arrayFields[4] = textField5;
        arrayFields[5] = textField6;
        arrayFields[6] = textField7;
        arrayFields[7] = textField8;
        arrayFields[8] = textField9;
        arrayFields[9] = textField10;
        arrayFields[10] = textField11;
        arrayFields[11] = textField12;
        arrayFields[12] = textField13;
        arrayFields[13] = textField14;
        
        clear();

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearColors();
                action = "selectAction";
                for(JTextField i : arrayFields) {
                    if(numequal(i)) {
                        i.setText("");
                    }
                }
            }
        });

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JTextField i : arrayFields) {
                    if(numequal(i)) {
                        i.setBackground(Color.GREEN);
                    }
                    else {
                        i.setBackground(Color.RED);
                    }
                }
            }
        });

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearColors();
                for(JTextField i : arrayFields) {
                    if(i.getText() == "") {
                        i.setText(selectField.getText());
                        break;
                    }
                }
            }
        });

        fillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearColors();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ArrayForm");
        frame.setContentPane(new ArrayForm2().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public int selectedNumber() {
        String str = selectField.getText();

        try {
            return Integer.getInteger(str);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Gib eine vernünftige Zahl ein.");
            return -1;
        }
    }

    public boolean numequal(JTextField field) {
        String selectStr = selectField.getText();
        String fieldStr = field.getText();
        int selectNum = -1, fieldNum;

        try {
            selectNum = Integer.parseInt(selectStr);
            fieldNum = Integer.parseInt(fieldStr);
            if(selectNum == fieldNum) {
                return true;
            }
        } catch(NumberFormatException e) {
            if(selectNum == -1 && action == "selectAction") {
                JOptionPane.showMessageDialog(null,"Gib eine vernünftige Zahl ein.");
                action = "";
            }
            return false;
        }

        return false;
    }

    public void clear() {
        for(JTextField i : arrayFields) {
            i.setText("");
            i.setBackground(Color.WHITE);
        }
    }

    public void clearColors() {
        for(JTextField i : arrayFields) {
            i.setBackground(Color.WHITE);
        }
    }
}
