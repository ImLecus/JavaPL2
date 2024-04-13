package gui;

import poo.javabnb.FontManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public JPanel panel;
    private JComboBox comboBox1;
    private JTextField barraDeBusquedaTextField;
    private JButton searchButton;
    private JLabel titleMain;
    private JScrollPane muroScroll;

    public Main() {
        comboBox1.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            String selectedItem = (String) cb.getSelectedItem();
            System.out.println("Item seleccionado: " + selectedItem);
            switch (selectedItem) {
                case "Perfil":
                    //Space for future hiding of windows and showing of others implementations
                    App.redirect("PROFILE");
                    break;
                case "Post guardados":
                    //Space for future hiding of windows and showing of others implementations
                    App.redirect("PINNED_POSTS");
                    break;
                case "Cerrar sesión":
                    //Space for future hiding of windows and showing of others implementations
                    App.session.endSession();
                    App.redirect("LOGIN");
                    break;
                case "EULA":
                    //Space for future hiding of windows and showing of others implementations
                    App.redirect("EULA");
                    break;
                case "Community Guidelines":
                    //Space for future hiding of windows and showing of others implementations
                    App.redirect("COMMUNITY_GUIDELINES");
                    break;
                default:
                    //No hacer nada
                    break;

            }
            FontManager.useFont(titleMain, FontManager.titleFont, Color.BLACK);
            FontManager.useFont(barraDeBusquedaTextField, FontManager.regularFont, Color.BLACK);
            FontManager.useFont(searchButton, FontManager.boldFont, Color.WHITE);
            FontManager.useFont(comboBox1, FontManager.boldFont, Color.BLACK);
            titleMain.setBorder(null);
            barraDeBusquedaTextField.setBorder(null);
            muroScroll.setBorder(null);
            searchButton.setBorder(null);
            comboBox1.setBorder(null);

        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buscando: " + barraDeBusquedaTextField.getText());
            }
        });
    }
}


