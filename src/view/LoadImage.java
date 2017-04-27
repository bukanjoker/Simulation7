/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author bukanjoker
 */
public class LoadImage 
{
    public static BufferedImage 
            cars, 
            background,
            red,
            yellow,
            green,
            carRight,
            carLeft,
            carUp,
            carBottom;
    
    public static void init()
    {
        background = imageLoader("../resources/background.jpg");
        
        red = imageLoader("../resources/red.png");
        yellow = imageLoader("../resources/yellow.png");
        green = imageLoader("../resources/green.png");
        
        carLeft = imageLoader("../resources/carLeft1.png");
        carRight = imageLoader("../resources/carRight1.png");
        carBottom = imageLoader("../resources/carBottom1.png");
        carUp = imageLoader("../resources/carUp1.png");
    }
    
    public static BufferedImage imageLoader(String path)
    {
        try {
            return ImageIO.read(LoadImage.class.getResource(path));
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
        return null;
    }
}
