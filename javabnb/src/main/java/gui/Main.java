package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JTextField barraDeBusquedaTextField;
    private JButton searchButton;

    public Main() {
        comboBox1.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            String selectedItem = (String) cb.getSelectedItem();
            System.out.println("Item seleccionado: " + selectedItem);
            switch (selectedItem) {
                case "Perfil":
                    //Space for future hiding of windows and showing of others implementations
                    //Profile.main(null); dont exist
                    break;
                case "Post guardados":
                    //Space for future hiding of windows and showing of others implementations
                    //PinnedPosts.main(null); dont exist
                    break;
                case "Cerrar sesión":
                    //Space for future hiding of windows and showing of others implementations
                    Login.main(null);
                    break;
                case "EULA":
                    //Space for future hiding of windows and showing of others implementations
                    EULA.main(null);
                    break;
                case "Cummunity Guidelines":
                    //Space for future hiding of windows and showing of others implementations
                    CommunityGuidelines.main(null);
                    break;
                default:
                    //No hacer nada
                    break;

            }

        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buscando: " + barraDeBusquedaTextField.getText());
            }
        });
    }

    public static void main(String[] args) {
        Main main = new Main();
        JFrame frame = new JFrame("Main");
        frame.setContentPane(main.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


