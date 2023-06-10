package exercises.exercise4;

import javax.swing.*;
import javax.swing.border.Border;

public class Exercise1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button and Label Example");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Label for confirm dialog result");
        label1.setBounds(350, 170, 300, 30);

        JLabel label2 = new JLabel("Label for input dialog result");
        label2.setBounds(350, 290, 300, 30);

        JButton button1 = new JButton("MessageBox");
        button1.setBounds(20, 50, 270, 30);

        JButton button2 = new JButton("Error Message");
        button2.setBounds(20, 110, 270, 30);

        JButton button3 = new JButton("Confirm Dialog");
        button3.setBounds(20, 170, 270, 30);

        JButton button4 = new JButton("Conform Dialog with more parameters");
        button4.setBounds(20, 230, 270, 30);

        JButton button5 = new JButton("Input Dialog");
        button5.setBounds(20, 290, 270, 30);

        frame.add(label1);
        frame.add(label2);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}

