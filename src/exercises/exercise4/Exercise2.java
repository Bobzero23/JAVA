package exercises.exercise4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counting");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(100, 100, 280, 30);

        JButton button = new JButton("Check the number of digits inside the text");
        button.setBounds(100, 150, 280, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textArea.getText();
                int digitCount = countDigits(inputText);
                String message = "Number of digits: " + digitCount;
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        frame.add(textArea);
        frame.add(button);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    private static int countDigits(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
