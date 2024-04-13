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
    private JButton aceptarButton;
    private JButton rechazarButton;
    private JLabel eulaText;

    public EULA() {
        titleEula.setBorder(null);
        eulaScroll.setBorder(null);
        FontManager.useFont(titleEula, FontManager.titleFont, Color.BLACK);
        FontManager.useFont(aceptarButton, FontManager.boldFont, Color.black);
        FontManager.useFont(rechazarButton, FontManager.boldFont, Color.black);
        aceptarButton.setBorder(null);
        rechazarButton.setBorder(null);
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.redirect("REGISTER");
            }
        });
        rechazarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.session.endSession();
                App.redirect("LOGIN");
            }
        });
    }
}
