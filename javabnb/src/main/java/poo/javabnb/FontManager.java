package poo.javabnb;

import gui.App;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.io.InputStream;

public class FontManager {

    public static final Font lightFont = loadFont("/fonts/Ubuntu-Light.ttf", 14);
    public static final Font regularFont = loadFont("/fonts/Ubuntu-Regular.ttf", 14);
    public static final Font boldFont = loadFont("/fonts/Ubuntu-Bold.ttf", 14);

    /**
     * useFont() adds a new custom text font to the proyect.
     * @param path the font path relative to "resources/" folder
     * @param size the size of the text
     * @return a new custom font
     */
    private static Font loadFont(String path,float size){
        try {
            InputStream is = App.class.getResourceAsStream(path);
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(16f);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void useFont(JTextComponent component, Font font, Color color){
        component.setFont(font);
        component.setForeground(color);
    }
    public static void useFont(JButton component, Font font, Color color){
        component.setFont(font);
        component.setForeground(color);
    }
}
