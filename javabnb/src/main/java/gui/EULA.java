package gui;

import poo.javabnb.FontManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EULA {
    public JPanel panel;
    private JScrollPane eulaScroll;
    private JLabel titleEula;
    private JButton leidoButton;
    private JLabel eulaText;

    public EULA() {
        titleEula.setBorder(null);
        eulaScroll.setBorder(null);
        FontManager.useFont(titleEula, FontManager.titleFont, Color.BLACK);
        FontManager.useFont(leidoButton, FontManager.boldFont, Color.black);
        FontManager.useFont(eulaText, FontManager.regularFont, Color.BLACK);
        leidoButton.setBorder(null);


        leidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.redirect("REGISTER");
            }
        });
    }
    }

