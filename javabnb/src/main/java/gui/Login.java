package gui;

import poo.javabnb.Client;
import poo.javabnb.Session;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField mailInput;
    private JPasswordField passwordInput;
    private JButton registerButton;
    private JButton loginButton;
    private JPanel panel;

    public Login() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register.main(null);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int key = App.db.getUserInDataBase(mailInput.getText(), String.valueOf(passwordInput.getPassword()));
                if(key >= 0){
                    Client user = App.db.getClientData(key);
                    App.session = Session.init(user);
                    System.out.println("SESIÓN INICIADA\n------------"+
                            "\nNombre: "    +   App.session.user.getName()+
                            "\nCorreo: "    +   App.session.user.getMail() +
                            "\nContraseña: "+   App.session.user.getPassword()+
                            "\nID: "        +   App.session.ID + "\n");
                    Main.main(null);
                }
                else {
                    System.out.println("ERROR\n--------\nUsuario o contraseña incorrectos.");
                }
            }
        });
    }

    public static void main(String[] args){
        Login login = new Login();
        JFrame frame = new JFrame("Login");

        frame.setContentPane(login.panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
