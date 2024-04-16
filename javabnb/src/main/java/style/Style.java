package style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Style {
    
    // Main color, made for bigger visual impact
    public static Color MAIN_COLOR =            new Color(255,61,61);
    // Highlight color when a MAIN_COLOR element is focused
    public static Color HIGHLIGHT_COLOR =       new Color(255, 78, 78);
    // Color for the text
    public static Color TEXT_COLOR =            new Color(53, 53, 53);
    // Secondary color, made for making contrast and impact
    public static Color SECONDARY_COLOR =       new Color(250, 184, 84);
    // Background color
    public static Color BG_COLOR =              new Color(255,248,249);
    // Input background color
    public static Color INPUT_BG_COLOR =        new Color(225,225,225);
    // Disabled background color
    public static Color DISABLED_COLOR =        new Color(80,80,80);
    
    /**
     * Applies HIGHLIGHT_COLOR to the element when the mouse is hovering
     * it.
     * @param component the component to be highlighted
     */
    public static void highlightOnHover(JButton component){
        component.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                if(component.isEnabled()){
                    component.setBackground(Style.HIGHLIGHT_COLOR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(component.isEnabled()){
                    component.setBackground(Style.MAIN_COLOR);
                }
            }
        });
    }
    
    public static void highlightOnHover(JLabel component){
        component.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                if(component.isEnabled()){
                    component.setForeground(Style.HIGHLIGHT_COLOR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(component.isEnabled()){
                    component.setForeground(Style.MAIN_COLOR);
                }
            }
        });
    }
    
    /**
     * Disables the element and applies the DISABLED_COLOR
     * @param component the component to disable
     */
    public static void disable(JComponent component){
        component.setEnabled(false);
        component.setBackground(DISABLED_COLOR);
    }
    
}
