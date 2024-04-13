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

    public Register() {
        FontManager.useFont(eulaLabel, FontManager.regularFont, Palette.mainColor);
        eulaLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eulaLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
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

        atrasButton.setBorder(null);
        atrasButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.redirect("LOGIN");
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
        FontManager.useFont(title, FontManager.titleFont, Palette.textColor);
        FontManager.useFont(atrasButton, FontManager.titleFont, Palette.textColor);
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
            System.out.println("DNI INVÁLIDO");
            return false;
        }
        // TO-DO: add letter validation

        return true;
    }

    private boolean validateName() {
        String name = nameInput.getText();
        for(char c: name.toCharArray()){
            if(!Character.isAlphabetic(c)){
                System.out.println("NOMBRE INVÁLIDO");
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
            hasLower |= Character.isLowerCase(c);
            hasUpper |= Character.isUpperCase(c);
            hasDigit |= Character.isDigit(c);
        }
        if(password.length < 8 ||  !(hasLower && hasUpper && hasDigit)){
            System.out.println("CONTRASEÑA INVÁLIDA");
            return  false;
        }
        // hash the password
        return true;

    }

    private boolean validatePhone() {
        String phone = phoneInput.getText();
        if(phone.length() < 9){
            System.out.println("TELÉFONO INVÁLIDO");
            return false;
        }
        for(char c: phone.toCharArray()){
            if(!Character.isDigit(c)) {
                System.out.println("TELÉFONO INVÁLIDO");
                return false;
            }
        }
        return true;
    }
}

