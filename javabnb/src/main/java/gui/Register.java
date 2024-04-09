package gui;

import poo.javabnb.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField mailInput;
    private JPanel panel1;
    private JPasswordField passwordInput;
    private JCheckBox termsCheckbox;
    private JButton submitButton;
    private JTextField nameInput;
    private JTextField DNIInput;
    private JTextField phoneInput;

    public Register(){
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
                Login.main(null);
            }
        });
    }

    private void register(){
        validateDNI();
        validateMail();
        validateName();
        validatePassword();
        validatePhone();
        Client client = new Client(
                DNIInput.getText(),
                nameInput.getText(),
                mailInput.getText(),
                String.valueOf(passwordInput.getPassword()),
                phoneInput.getText()
        );
        App.db.add(client);
    }

    private void validateDNI(){}
    private void validateName(){}
    private void validateMail(){}
    private void validatePassword(){}
    private void validatePhone(){}

    public static void main(String[] args) {
        Register register = new Register();
        JFrame frame = new JFrame("Register");
        frame.setContentPane(register.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}