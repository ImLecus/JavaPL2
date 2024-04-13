package gui;

import poo.javabnb.Client;
import poo.javabnb.FontManager;
import style.Palette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JLabel DNILabel;
    private JLabel mailLabel;
    private JLabel passwordLabel;
    private JLabel title;

    public Register() {
        FontManager.useFont(submitButton, FontManager.boldFont, Color.WHITE);
        submitButton.setBorder(null);
        submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
                App.redirect("LOGIN");
            }
        });
        submitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                submitButton.setBackground(Palette.highlightColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                submitButton.setBackground(Palette.mainColor);
            }
        });
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.redirect("LOGIN");
            }
        });

        FontManager.useFont(termsCheckbox, FontManager.regularFont, Color.BLACK);

        nameInput.setBorder(null);
        FontManager.useFont(nameInput, FontManager.regularFont, Color.BLACK);
        mailInput.setBorder(null);
        FontManager.useFont(mailInput, FontManager.regularFont, Color.BLACK);
        DNIInput.setBorder(null);
        FontManager.useFont(DNIInput, FontManager.regularFont, Color.BLACK);
        phoneInput.setBorder(null);
        FontManager.useFont(phoneInput, FontManager.regularFont, Color.BLACK);
        passwordInput.setBorder(null);
        FontManager.useFont(passwordInput, FontManager.regularFont, Color.BLACK);

        FontManager.useFont(nameLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(mailLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(DNILabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(phoneLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(passwordLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(title, FontManager.titleFont, Color.BLACK);
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
}

