package poo.javabnb.util;

import gui.App;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Images {
    
    /**
     * Resizes an image to an specified dimensions and saves it in a new path.
     * @param inputFile the file to be rescaled.
     * @param outputImagePath the output path in a String.
     * @param scaledWidth the new width.
     * @param scaledHeight the new height.
     */
    public static void resizeImage(File inputFile, String outputImagePath, int scaledWidth, int scaledHeight) {
        try{
            BufferedImage inputImage = ImageIO.read(inputFile);
            BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, inputImage.getType());

            Graphics2D g2d = outputImage.createGraphics();
            g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
            g2d.dispose();

            String formatName = outputImagePath.substring(outputImagePath.lastIndexOf(".") + 1);
            ImageIO.write(outputImage, formatName, new File(outputImagePath));
        }
        catch(Exception e){
            e.fillInStackTrace();
        }
    }   
    
    /**
     * Instantiates a new JFileChooser that can choose only .png files.
     * @return the file choosen, null in case of error.
     */
    public static File createImageChooser(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG (*.png)", "png"));
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            return file;
        }
        return null;
    }
}
