package gui;

import poo.javabnb.FontManager;
import style.Style;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public JPanel panel;
    private JComboBox comboBox1;
    private JTextField barraDeBusquedaTextField;
    private JButton searchButton;
    private JScrollPane muroScroll;

    public Main() {
        comboBox1.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            String selectedItem = (String) cb.getSelectedItem();
            System.out.println("Item seleccionado: " + selectedItem);
            switch (selectedItem) {
                case "Perfil":
                    App.redirect("PROFILE");
                    break;
                case "Post guardados":
                    App.redirect("PINNED_POSTS");
                    break;
                case "Cerrar sesión":
                    App.session.endSession();
                    App.redirect("LOGIN");
                    break;
                case "Community Guidelines":
                    App.redirect("COMMUNITY_GUIDELINES");
                    break;
                default:
                    break;
            }
            //FontManager.useFont(barraDeBusquedaTextField, FontManager.regularFont,  Style.TEXT_COLOR);
            //FontManager.useFont(searchButton, FontManager.boldFont,  Style.TEXT_COLOR);
            //FontManager.useFont(comboBox1, FontManager.boldFont,  Style.TEXT_COLOR);
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


