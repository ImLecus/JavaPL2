package gui;

import poo.javabnb.Client;
import poo.javabnb.Session;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Login {
    private JTextField mailInput;
    private JPasswordField passwordInput;
    private JButton registerButton;
    private JButton loginButton;
    public JPanel panel;

    public Login() {
        loginButton.setFont(App.boldFont);
        loginButton.setForeground(Color.WHITE);
        registerButton.setFont(App.boldFont);

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
