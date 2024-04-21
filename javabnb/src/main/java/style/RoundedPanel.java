package style;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {
    private int radius;
    
    public RoundedPanel(int radius){
        this.radius = radius;
        setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(getBackground());
        g2d.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), radius, radius));
        
        g2d.dispose();
    }

    // Método para establecer el radio de las esquinas
    public void setCornerRadius(int radius) {
        this.radius = radius;
        repaint();
    }
}
