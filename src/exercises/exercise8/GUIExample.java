package exercises.exercise8;

import javax.swing.*;


import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;


public class GUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 200, 30);

        JButton button = new JButton("Button");
        button.setBounds(20, 60, 100, 30);
        button.setEnabled(false);

        ButtonVisibilityListener buttonVisibilityListener = new ButtonVisibilityListener(button);
        textField.getDocument().addDocumentListener(buttonVisibilityListener);

        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }

    static class ButtonVisibilityListener implements DocumentListener {
        private final JButton button;

        public ButtonVisibilityListener(JButton button) {
            this.button = button;
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateButtonState(e);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateButtonState(e);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateButtonState(e);
        }

        private void updateButtonState(DocumentEvent e) {
            String text = null;
            try {
                text = e.getDocument().getText(0, e.getDocument().getLength());
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
            if (text.length() >= 10) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
        }
    }
}


