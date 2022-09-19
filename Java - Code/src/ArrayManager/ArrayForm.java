package ArrayManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class ArrayForm {
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
    public int cursor;

    //constructor

    public ArrayForm() {

        arrayFields[0] = textField14;
        arrayFields[1] = textField13;
        arrayFields[2] = textField12;
        arrayFields[3] = textField11;
        arrayFields[4] = textField10;
        arrayFields[5] = textField9;
        arrayFields[6] = textField8;
        arrayFields[7] = textField7;
        arrayFields[8] = textField6;
        arrayFields[9] = textField5;
        arrayFields[10] = textField4;
        arrayFields[11] = textField3;
        arrayFields[12] = textField2;
        arrayFields[13] = textField1;


        inputArray = resetArray(inputArray);
        showArray(inputArray, arrayFields);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
            }
        });

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetArray(inputArray);
                showArray(inputArray, arrayFields);
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search(inputArray, arrayFields);
            }
        });

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputArray = insert(inputArray);
                showArray(inputArray, arrayFields);
            }
        });

        fillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputArray = fill(inputArray);
                showArray(inputArray, arrayFields);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ArrayForm");
        frame.setContentPane(new ArrayForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static void showArray(int inputArray[], JTextField[] arrayFields)
    {
        for(int i=0; i< arrayFields.length; i++){
            if(inputArray[i] == -1) {
                arrayFields[i].setText(" ");
            }else {
                arrayFields[i].setText(String.valueOf(inputArray[i]));
            }
        }
    }

    public int[] resetArray(int inputArray[]) {
        clearColors(arrayFields);
        for(int i=0; i< inputArray.length; i++) {
            inputArray[i] = -1;
        }

        return inputArray;
    }

    public int setCursor() {
        try{
            int cursor = Integer.parseInt(selectField.getText());
            return cursor;
        } catch (NumberFormatException e) {
            int cursor = -2;
            JOptionPane.showMessageDialog(null,"Gib eine vernünftige Zahl ein.");
            return cursor;
        }
    }

    public int[] insert(int inputArray[]) {
        clearColors(arrayFields);
        cursor = setCursor();
        if(cursor != -2) {
            for (int i=0; i < inputArray.length; i++) {
                if(inputArray[i] == -1) {
                    inputArray[i] = cursor;
                    return inputArray;
                }
            }
        }
        return inputArray;
    }

    public int[] fill(int inputArray[]) {
        clearColors(arrayFields);
        for (int i=0; i < inputArray.length; i++) {
            if(inputArray[i] == -1) {
                inputArray[i] = (int)(Math.random() * 100);
                return inputArray;
            }
        }

        return inputArray;
    }

    public void delete() {
        clearColors(arrayFields);
        cursor = setCursor();
        for(int i=0; i < inputArray.length; i++){
            if(inputArray[i] == cursor) {
                inputArray[i] = -1;
            }
        }

        showArray(inputArray, arrayFields);
    }

    public void clearColors(JTextField[] arrrayFields) {
        for(JTextField i : arrayFields) {
            i.setBackground(Color.WHITE);
        }
    }

    public void search(int inputArray[], JTextField[] arrayFields) {
        cursor = setCursor();
        if(cursor != -2) {
            for(int i=0; i < inputArray.length; i++){
                if(inputArray[i] == cursor) {
                    arrayFields[i].setBackground(Color.GREEN);
                }
                else {
                    arrayFields[i].setBackground(Color.RED);
                }
            }
        }
    }
}
