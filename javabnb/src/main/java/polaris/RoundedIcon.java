package polaris;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;

public class RoundedIcon extends JButton {
    private int radius;
    private String path;

    public RoundedIcon(String path, int radius) {
        this.path = path;
        this.radius = radius;
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        BufferedImage buttonImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = buttonImage.createGraphics();

        g2d.setColor(getBackground());
        g2d.fill(new RoundRectangle2D.Double(0, 0, width, height, radius, radius));

        setIcon(new ImageIcon(getClass().getResource(this.path)));

        g.drawImage(buttonImage, 0, 0, null);
    }


}
