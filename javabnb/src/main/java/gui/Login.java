package gui;

import poo.javabnb.Client;
import poo.javabnb.FontManager;
import poo.javabnb.Session;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
                    App.redirect("MAIN");
                } else {
                    System.out.println("ERROR\n--------\nUsuario o contraseña incorrectos.");
                }
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setBackground(App.highlightColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setBackground(App.mainColor);
            }
        });

        FontManager.useFont(noaccountLabel, FontManager.regularFont, Color.GRAY);

        FontManager.useFont(registerLabel, FontManager.boldFont, App.mainColor);
        registerLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                App.redirect("REGISTER");
            }
        });
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                registerLabel.setForeground(App.highlightColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                registerLabel.setForeground(App.mainColor);
            }
        });

        FontManager.useFont(contrasenaLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(mailLabel, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(tituloLabel, FontManager.titleFont, Color.BLACK);

        FontManager.useFont(mailInput, FontManager.regularFont, Color.BLACK);
        FontManager.useFont(passwordInput, FontManager.regularFont, Color.BLACK);
        passwordInput.setBorder(null);
        mailInput.setBorder(null);
    }
}
