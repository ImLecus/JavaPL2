package gui;

import poo.javabnb.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField mailInput;
    private JPanel panel1;
    private JPasswordField passwordInput;
    private JCheckBox termsCheckbox;
    private JButton submitButton;
    private JTextField nameInput;
    private JTextField DNIInput;
    private JTextField phoneInput;

    public Register(){
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client(
                        DNIInput.getText(),
                        nameInput.getText(),
                        mailInput.getText(),
                        String.valueOf(passwordInput.getPassword()),
                        phoneInput.getText()
                );
                App.db.add(client);
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