package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        setLayout(new BorderLayout());

        // Background image panel
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image img = new ImageIcon("background.jpeg").getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };

        backgroundPanel.setLayout(new GridBagLayout());

        // Username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        usernameField.setPreferredSize(new Dimension(200, 30));

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        passwordField.setPreferredSize(new Dimension(200, 30));

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Perform login authentication here (not implemented in this example).
                // For a real application, you should perform the authentication against a database.
                // For this example, you can simply display a message box indicating login success.
                JOptionPane.showMessageDialog(LoginUI.this, "Login successful!");
            }
        });

        // Add components to the backgroundPanel using GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        backgroundPanel.add(usernameLabel, gbc);
        gbc.gridy++;
        backgroundPanel.add(usernameField, gbc);
        gbc.gridy++;
        backgroundPanel.add(passwordLabel, gbc);
        gbc.gridy++;
        backgroundPanel.add(passwordField, gbc);
        gbc.gridy++;
        backgroundPanel.add(loginButton, gbc);

        add(backgroundPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginUI();
            }
        });
    }
}

