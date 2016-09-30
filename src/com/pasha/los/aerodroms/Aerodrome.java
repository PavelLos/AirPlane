package com.pasha.los.aerodroms;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/**
 * Created by pasha on 28.09.2016.
 */
public class Aerodrome {

    private Image aerodromeImage;

    private int xAerodrome;
    private int yAerodrome;

    private Rectangle2D aerodrmeBorder;

    public Aerodrome() {
        Random random = new Random();
        aerodromeImage = Toolkit.getDefaultToolkit().getImage("images\\Aerodrome.png");
        xAerodrome = random.nextInt(590);
        yAerodrome = -1 * random.nextInt(600);
        aerodrmeBorder = new Rectangle2D.Double(xAerodrome, yAerodrome, 120, 120);
    }

    public void move(int speed){
        yAerodrome = yAerodrome + speed;
        aerodrmeBorder = new Rectangle2D.Double(xAerodrome, yAerodrome, 120, 120);
    }

    public Image getAerodromeImage() {
        return aerodromeImage;
    }

    public void setAerodromeImage(Image aerodromeImage) {
        this.aerodromeImage = aerodromeImage;
    }

    public int getxAerodrome() {
        return xAerodrome;
    }

    public void setxAerodrome(int xAerodrome) {
        this.xAerodrome = xAerodrome;
    }

    public int getyAerodrome() {
        return yAerodrome;
    }

    public void setyAerodrome(int yAerodrome) {
        this.yAerodrome = yAerodrome;
    }

    public Rectangle2D getAerodrmeBorder() {
        return aerodrmeBorder;
    }
}
