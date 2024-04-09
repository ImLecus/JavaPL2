package gui;

import javax.swing.*;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton registrarseButton;
    private JButton iniciarSesiónButton;
    private JPanel panel;

    public static void main(String[] args){
        Login login = new Login();
        JFrame frame = new JFrame("Login");

        frame.setContentPane(login.panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
