package gui;

import poo.javabnb.Client;
import poo.javabnb.DataBase;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField exampleExampleComTextField;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JCheckBox aceptaLosTérminosYCheckBox;
    private JButton registrarseButton;

    public Register(){
        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login.main(null);
            }
        });
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Register
        Register register = new Register();

        // Crear una nueva ventana
        JFrame frame = new JFrame("Register");

        // Agregar el panel a la ventana
        frame.setContentPane(register.panel1);

        // Configurar la operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajustar el tamaño de la ventana a sus componentes
        frame.pack();

        // Hacer la ventana visible
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}