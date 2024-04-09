package gui;

import poo.javabnb.Client;
import poo.javabnb.Session;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton registrarseButton;
    private JButton iniciarSesionButton;
    private JPanel panel;

    public Login() {
        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register.main(null);
            }
        });
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client defaultClient = new Client("00000000E", "Usuario", "user@user.com", "password", "666666666");
                if(textField1.getText().equals("user@user.com") && String.valueOf(passwordField1.getPassword()).equals("password") ){
                    Session session = Session.init(defaultClient);
                    System.out.println("SESIÓN INICIADA\n------------"+
                            "\nNombre: "    +   session.user.getName()+
                            "\nCorreo: "    +   session.user.getMail() +
                            "\nContraseña: "+   session.user.getPassword()+
                            "\nID: "        +   session.ID + "\n");
                    Main.main(null);
                }
                else{
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
