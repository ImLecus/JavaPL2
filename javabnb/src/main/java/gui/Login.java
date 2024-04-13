package gui;

import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Session;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField mailInput;
    private JPasswordField passwordInput;
    private JButton registerButton;
    private JButton loginButton;
    public JPanel panel;
    private JLabel contrasenaLabel;
    private JLabel mailLabel;
    private JLabel tituloLabel;

    public Login() {

        FontManager.useFont(loginButton, FontManager.boldFont, Color.WHITE);
        FontManager.useFont(registerButton, FontManager.boldFont, Color.BLACK);
        FontManager.useFont(contrasenaLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(mailLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(tituloLabel, FontManager.titleFont, Color.RED);
        FontManager.useFont(mailInput, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(passwordInput, FontManager.regularFont, Color.BLACK);



        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.redirect("REGISTER");
            }
        });
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
                    App.redirect("MAIN");
                } else {
                    System.out.println("ERROR\n--------\nUsuario o contraseña incorrectos.");
                }
            }
        });
    }
}
