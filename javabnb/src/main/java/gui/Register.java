package gui;

import javax.swing.*;

public class Register {
    private JTextField exampleExampleComTextField;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JCheckBox aceptaLosTérminosYCheckBox;
    private JButton registrarseButton;

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
}