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
    private JLabel eulaLabel;
    private JLabel passwordLabel2;
    private JLabel passwordLabel3;
    private JLabel errorLabel1;
    private JLabel errorLabel2;
    private JLabel errorLabel3;
    private JLabel errorLabel4;
    private JLabel errorLabel5;

    public Register() {

        FontManager.useFont(errorLabel1, FontManager.regularFont, Palette.secondaryColor);
        FontManager.useFont(errorLabel2, FontManager.regularFont, Palette.secondaryColor);
        FontManager.useFont(errorLabel3, FontManager.regularFont, Palette.secondaryColor);
        FontManager.useFont(errorLabel4, FontManager.regularFont, Palette.secondaryColor);
        FontManager.useFont(errorLabel5, FontManager.regularFont, Palette.secondaryColor);

        submitButton.setEnabled(false);
        submitButton.setBackground(Palette.textColor);

        FontManager.useFont(eulaLabel, FontManager.regularFont, Palette.mainColor);
        eulaLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eulaLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetErrorLabels();
                resetText();
                App.redirect("EULA");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                eulaLabel.setForeground(Palette.highlightColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                eulaLabel.setForeground(Palette.mainColor);
            }
        });

        FontManager.useFont(submitButton, FontManager.boldFont, Color.WHITE);
        submitButton.setBorder(null);
        submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetErrorLabels();
                register();
            }
        });
        submitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if(submitButton.isEnabled()){
                    submitButton.setBackground(Palette.highlightColor);
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(submitButton.isEnabled()) {
                    submitButton.setBackground(Palette.mainColor);
                }
            }
        });

        atrasButton.setBorder(null);
        atrasButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetText();
                resetErrorLabels();
            }

        });

        FontManager.useFont(termsCheckbox, FontManager.regularFont, Palette.textColor);

        nameInput.setBorder(null);
        FontManager.useFont(nameInput, FontManager.regularFont, Palette.textColor);
        mailInput.setBorder(null);
        FontManager.useFont(mailInput, FontManager.regularFont, Palette.textColor);
        DNIInput.setBorder(null);
        FontManager.useFont(DNIInput, FontManager.regularFont, Palette.textColor);
        phoneInput.setBorder(null);
        FontManager.useFont(phoneInput, FontManager.regularFont, Palette.textColor);
        passwordInput.setBorder(null);
        FontManager.useFont(passwordInput, FontManager.regularFont, Palette.textColor);

        FontManager.useFont(nameLabel, FontManager.regularFont, Palette.textColor);
        FontManager.useFont(mailLabel, FontManager.regularFont, Palette.textColor);
        FontManager.useFont(DNILabel, FontManager.regularFont, Palette.textColor);
        FontManager.useFont(phoneLabel, FontManager.regularFont, Palette.textColor);
        FontManager.useFont(passwordLabel, FontManager.regularFont, Palette.textColor);
        FontManager.useFont(passwordLabel2, FontManager.subText, Palette.textColor);
        FontManager.useFont(passwordLabel3, FontManager.subText, Palette.textColor);
        FontManager.useFont(title, FontManager.titleFont, Palette.textColor);
        FontManager.useFont(atrasButton, FontManager.titleFont, Palette.textColor);
        termsCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButton.setEnabled(termsCheckbox.isSelected());
                submitButton.setBackground(submitButton.isEnabled() ? Palette.mainColor : Palette.textColor);
            }
        });
    }

    private void register() {
        if(validateName() && validatePhone() && validateDNI() && validateMail() && validatePassword()){
            Client client = new Client(
                    DNIInput.getText(),
                    nameInput.getText(),
                    mailInput.getText(),
                    String.valueOf(passwordInput.getPassword()),
                    phoneInput.getText()
            );
            App.db.add(client);
            App.redirect("LOGIN");
        }
        resetText();
    }

    private boolean validateDNI() {
        String dni = DNIInput.getText();
        if(dni.length() != 9){
            errorLabel3.setVisible(true);
            return false;
        }
        // TO-DO: add letter validation

        return true;
    }

    private boolean validateName() {
        String name = nameInput.getText();
        for(char c: name.toCharArray()){
            if(!Character.isAlphabetic(c)){
                errorLabel1.setVisible(true);
                return false;
            }
        }
        if(name.isEmpty()){
            errorLabel1.setVisible(true);
            return false;
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
            hasLower |= Character.isLowerCase(c);
            hasUpper |= Character.isUpperCase(c);
            hasDigit |= Character.isDigit(c);
        }
        if(password.length < 8 ||  !(hasLower && hasUpper && hasDigit)){
            errorLabel5.setVisible(true);
            return  false;
        }
        // hash the password
        return true;

    }

    private boolean validatePhone() {
        String phone = phoneInput.getText();
        if(phone.length() < 9){
            errorLabel2.setVisible(true);
            return false;
        }
        for(char c: phone.toCharArray()){
            if(!Character.isDigit(c)) {
                errorLabel2.setVisible(true);
                return false;
            }
        }
        return true;
    }

    private void resetText(){

        mailInput.setText("");
        passwordInput.setText("");
        DNIInput.setText("");
        nameInput.setText("");
        phoneInput.setText("");
    }

    private void resetErrorLabels(){
        errorLabel1.setVisible(false);
        errorLabel2.setVisible(false);
        errorLabel3.setVisible(false);
        errorLabel4.setVisible(false);
        errorLabel5.setVisible(false);
    }
}

