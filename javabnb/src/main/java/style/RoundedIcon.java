package style;

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

        // Crear una imagen para dibujar el botón y su imagen
        BufferedImage buttonImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = buttonImage.createGraphics();

        // Dibujar el botón redondeado
        g2d.setColor(getBackground());
        g2d.fill(new RoundRectangle2D.Double(0, 0, width, height, radius, radius));

        // Dibujar la imagen en el botón
        //g2d.drawImage(image, 0, 0, width, height, null);
        //g2d.dispose();
        setIcon(new ImageIcon(getClass().getResource(this.path)));

        // Dibujar la imagen en el botón
        g.drawImage(buttonImage, 0, 0, null);
    }

    // Método para establecer el radio de las esquinas
    public void setCornerRadius(int cornerRadius) {
        this.radius = cornerRadius;
        repaint(); // Vuelve a pintar el botón con el nuevo valor de radio
    }

}
