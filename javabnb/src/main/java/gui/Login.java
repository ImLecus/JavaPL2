package gui;

import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Session;
import style.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.PublicKey;

public class Login {
    private JTextField mailInput;
    private JPasswordField passwordInput;
    private JButton loginButton;
    public JPanel panel;
    private JLabel contrasenaLabel;
    private JLabel mailLabel;
    private JLabel tituloLabel;
    private JLabel noaccountLabel;
    private JLabel registerLabel;
    private JLabel errorLabel;

    public Login() {

        FontManager.useFont(loginButton, FontManager.boldFont, Color.WHITE);
        loginButton.setBorder(null);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int key = App.db.getUserInDataBase(mailInput.getText(), String.valueOf(passwordInput.getPassword()));
                if (key >= 0) {
                    Client user = App.db.getClientData(key);
                    App.session = Session.init(user);
                    System.out.println("SESIÓN INICIADA\n------------" +
                            "\nNombre: " + App.session.user.getName() +
                            "\nCorreo: " + App.session.user.getMail() +
                            "\nContraseña: " + App.session.user.getPassword() +
                            "\nID: " + App.session.ID + "\n");
                    resetText();
                    App.redirect("MAIN");
                } else {
                    resetText();
                    errorLabel.setText("Usuario o contraseña incorrectos");
                }
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setBackground(Palette.highlightColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setBackground(Palette.mainColor);
            }
        });


        FontManager.useFont(noaccountLabel, FontManager.regularFont, Color.GRAY);

        registerLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetText();
                App.redirect("REGISTER");
            }
        });
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                registerLabel.setForeground(Palette.highlightColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                registerLabel.setForeground(Palette.mainColor);
            }
        });

        FontManager.setRegularFont(new JComponent[]{
                contrasenaLabel,
                mailLabel,
                mailInput,
                passwordInput
        });
        FontManager.setAnchorFont(new JComponent[]{
                registerLabel
        });
        FontManager.setErrorFont(new JComponent[]{
                errorLabel
        });
        FontManager.useFont(tituloLabel, FontManager.titleFont, Palette.textColor);

        passwordInput.setBorder(null);
        mailInput.setBorder(null);
    }

    private void resetText(){
        mailInput.setText("");
        passwordInput.setText("");
        errorLabel.setText("");
    }
}
