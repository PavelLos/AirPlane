package com.pasha.los.air.road;

import java.awt.*;

/**
 * Created by pasha on 26.09.2016.
 */
public class AirModel {
    private Image airModelImage;
    public static final int HEIGHT_SIZE = 1300;
    public static final int WIDTH_SIZE = 600;


    public AirModel() {
        airModelImage = Toolkit.getDefaultToolkit().getImage("images\\air.png");
    }

    public Image getAirModelImage() {
        return airModelImage;
    }
}
