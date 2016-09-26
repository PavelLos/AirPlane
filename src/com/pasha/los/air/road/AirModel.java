package com.pasha.los.air.road;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by pasha on 26.09.2016.
 */
public class AirModel extends JComponent{
    private Image airModelImage;
    public static final int HEIGHT_SIZE = 1300;
    public static final int WIDTH_SIZE = 600;


    public AirModel() {
        airModelImage = new BufferedImage(HEIGHT_SIZE, WIDTH_SIZE, BufferedImage.TYPE_INT_RGB);
        airModelImage = Toolkit.getDefaultToolkit().getImage("images\\air.png");
    }

    public Image getAirModelImage() {
        return airModelImage;
    }

    public void paintComponent(Graphics2D g){
        g= (Graphics2D) airModelImage.getGraphics();
        g.drawImage(airModelImage, 0, 0, null);
    }
}
