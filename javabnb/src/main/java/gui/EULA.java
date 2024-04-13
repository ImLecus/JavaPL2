package gui;

import poo.javabnb.FontManager;

import javax.swing.*;
import java.awt.*;

public class EULA {
    public JPanel panel;
    private JScrollPane eulaScroll;
    private JLabel titleEula;
    public EULA() {
        titleEula.setBorder(null);
        eulaScroll.setBorder(null);
        FontManager.useFont(titleEula, FontManager.titleFont, Color.BLACK);
    }
}
