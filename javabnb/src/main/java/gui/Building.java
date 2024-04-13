package gui;

import poo.javabnb.FontManager;

import javax.swing.*;
import java.awt.*;

public class Building {
    public JPanel panel1;
    private JLabel bannerLabel;
    private JLabel buildingName;

    public Building() {
        FontManager.useFont(buildingName, FontManager.titleFont, Color.BLACK);
    }


}
