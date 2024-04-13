package gui;

import poo.javabnb.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Register {
    public JPanel panel;
    private JTextField mailInput;
    public JPanel pane1;
    private JPasswordField passwordInput;
    private JCheckBox termsCheckbox;
    private JButton submitButton;
    private JTextField nameInput;
    private JTextField DNIInput;
    private JTextField phoneInput;
    private JButton atrasButton;

    public Register() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
                App.redirect("LOGIN");
            }
        });
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.redirect("LOGIN");
            }
        });
    }

    private void register() {
        if(validatePhone() && validateDNI() && validateName() && validatePassword() && validateMail()){
            Client client = new Client(
                    DNIInput.getText(),
                    nameInput.getText(),
                    mailInput.getText(),
                    String.valueOf(passwordInput.getPassword()),
                    phoneInput.getText()
            );
            App.db.add(client);
        }
    }

    private boolean validateDNI() {
        String dni = DNIInput.getText();
        if(dni.length() != 9){
            return false;
        }
        // TO-DO: add letter validation

        return true;
    }

    private boolean validateName() {
        String name = nameInput.getText();
        for(char c: name.toCharArray()){
            if(!Character.isAlphabetic(c)){
                return false;
            }
        }
        return true;
    }

    private boolean validateMail() {
        return true;
    }

    private boolean validatePassword() {
        char[] password = passwordInput.getPassword();
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        for(char c: password){
            if(Character.isLowerCase(c)){
                hasLower = true;
            }
            if(Character.isUpperCase(c)){
                hasUpper = true;
            }
            if(Character.isDigit(c)){
                hasDigit = true;
            }
        }
        return password.length >= 8 && (hasLower && hasUpper && hasDigit);
        // hash the password
    }

    private boolean validatePhone() {
        char[] phone = phoneInput.getText().toCharArray();
        for(char c: phone){
            if(!Character.isDigit(c) || c != ' ' || c != '-'){
                return false;
            }
        }
        if(phone.length < 9){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Register register = new Register();
        JFrame frame = new JFrame("Register");
        frame.setContentPane(register.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}

