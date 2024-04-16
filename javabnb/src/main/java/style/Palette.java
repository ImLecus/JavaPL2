package style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.text.JTextComponent;

public class Palette {
    /**
     * Palette class has all the color palette that the application uses.
     */
    public static Color mainColor = new Color(255,61,61);
    public static Color highlightColor = new Color(255, 78, 78);
    public static Color textColor = new Color(53, 53, 53);
    public static Color secondaryColor = new Color(250, 184, 84);
    public static Color bgColor = new Color(255,248,249);
    
    public static void highlightOnHover(JButton component){
        component.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                if(component.isEnabled()){
                    component.setBackground(Palette.highlightColor);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(component.isEnabled()){
                    component.setBackground(Palette.mainColor);
                }
            }
        });
    }
    
    public static void highlightOnHover(JLabel component){
        component.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                if(component.isEnabled()){
                    component.setForeground(Palette.highlightColor);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(component.isEnabled()){
                    component.setForeground(Palette.mainColor);
                }
            }
        });
    }
}
