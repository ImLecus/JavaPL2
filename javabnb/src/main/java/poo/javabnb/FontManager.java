package poo.javabnb;

import gui.App;
import style.Palette;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.io.InputStream;

public class FontManager {


    public static final Font lightFont = loadFont("/fonts/Ubuntu-Light.ttf", 14);
    public static final Font regularFont = loadFont("/fonts/Ubuntu-Regular.ttf", 14);
    public static final Font boldFont = loadFont("/fonts/Ubuntu-Bold.ttf", 14);

    public static final Font titleFont = boldFont.deriveFont(36f);
    public static final Font subText = lightFont.deriveFont(12f);

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

    public static void useFont(JComponent component, Font font, Color color){
        component.setFont(font);
        component.setForeground(color);
    }

    public static void setRegularFont(JComponent[] components){
        for (JComponent c: components){
            useFont(c, regularFont, Palette.textColor);
        }
    }

    public static void setErrorFont(JComponent[] components){
        for (JComponent c: components){
            useFont(c, regularFont, Palette.secondaryColor);
        }
    }
    public static void setSubTextFont(JComponent[] components){
        for (JComponent c: components){
            useFont(c, subText, Palette.textColor);
        }
    }
    public static void setAnchorFont(JComponent[] components){
        for (JComponent c: components){
            useFont(c, boldFont, Palette.mainColor);
        }
    }
}
