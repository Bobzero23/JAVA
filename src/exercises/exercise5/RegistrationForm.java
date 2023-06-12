package exercises.exercise5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    private JFrame registrationFrame;
    private JFrame loginFrame;
    private JTextField loginField;
    private JPasswordField passwordField;

    public RegistrationForm() {
        createRegistrationForm();
    }

    private void createRegistrationForm() {
        registrationFrame = new JFrame("Registration Form");
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrationFrame.setSize(600, 450);
        registrationFrame.setLayout(null);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(150, 50, 150, 30);


        loginField = new JTextField();
        loginField.setBounds(250, 50, 250, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(150, 110, 150, 30);


        passwordField = new JPasswordField();
        passwordField.setBounds(250, 110, 250, 30);

        JButton registerButton = new JButton("Registration");
        registerButton.setBounds(280, 250, 150, 30);
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String password = new String(passwordField.getPassword());

                if (login.length() >= 5 && password.length() >= 3 && password.matches(".*\\d.*")) {
                    JOptionPane.showMessageDialog(registrationFrame, "Registration successful!");
                    registrationFrame.setVisible(false);
                    createLoginForm();
                } else {
                    JOptionPane.showMessageDialog(registrationFrame, "Invalid registration details!");
                }
            }
        });

        registrationFrame.add(loginLabel);
        registrationFrame.add(loginField);
        registrationFrame.add(passwordLabel);
        registrationFrame.add(passwordField);
        registrationFrame.add(registerButton);

        registrationFrame.setVisible(true);
    }

    private void createLoginForm() {
        loginFrame = new JFrame("Login Form");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(600, 450);
        loginFrame.setLayout(null);

        JLabel loginLabel = new JLabel("Login:");
        loginLabel.setBounds(150, 50, 150, 30);

        JTextField loginField = new JTextField();
        loginField.setBounds(250, 50, 250, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(150, 110, 150, 30);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(250, 110, 250, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(280, 250, 150, 30);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String password = new String(passwordField.getPassword());

                if (login.equals(loginField.getText()) && password.equals(new String(passwordField.getPassword()))) {
                    JOptionPane.showMessageDialog(loginFrame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid login credentials!");
                }
            }
        });

        loginFrame.add(loginLabel);
        loginFrame.add(loginField);
        loginFrame.add(passwordLabel);
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);

        loginFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm();
            }
        });
    }
}
