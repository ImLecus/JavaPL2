package poo.javabnb.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageResizer {

    public static void resizeImage(String inputImagePath, String outputImagePath, int scaledWidth, int scaledHeight)
            throws IOException {
        try{
        // Leer la imagen
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // Crear una nueva imagen con las dimensiones deseadas
        BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, inputImage.getType());

        // Escalar la imagen
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        // Guardar la imagen redimensionada en el archivo de salida
        String formatName = outputImagePath.substring(outputImagePath.lastIndexOf(".") + 1);
        ImageIO.write(outputImage, formatName, new File(outputImagePath));
        }
        catch(Exception e){
        e.fillInStackTrace();
        }
    }   
}
