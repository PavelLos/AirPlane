package com.pasha.los.plane;

import com.pasha.los.GameConstants;

import java.awt.*;

/**
 * Created by pasha on 26.09.2016.
 */
public class AirPlaneModel {
    private Image planeImage;

    private int xAirPlane;
    private int yAirPlane;
    private int speedOfAirPlane;
    private int distancePlane;


    public AirPlaneModel() {
        planeImage = Toolkit.getDefaultToolkit().getImage("images\\airplanesmall.png");
        speedOfAirPlane = 5;
        distancePlane = 0;

        xAirPlane = GameConstants.WIDTH_SIZE - 400;
        yAirPlane = GameConstants.HEIGHT_SIZE - 150;
    }

    public void movePlane() {
        distancePlane += speedOfAirPlane;

    }

    public int getSpeedOfAirPlane() {
        return speedOfAirPlane;
    }

    public void setSpeedOfAirPlane(int speedOfAirPlane) {
        this.speedOfAirPlane = speedOfAirPlane;
    }

    public Image getPlaneImage() {
        return planeImage;
    }

    public int getxAirPlane() {
        return xAirPlane;
    }

    public void setxAirPlane(int xAirPlane) {
        if (xAirPlane > 0 && xAirPlane < 590)
            this.xAirPlane = xAirPlane;
    }

    public int getyAirPlane() {
        return yAirPlane;
    }

    public void setyAirPlane(int yAirPlane) {
        this.yAirPlane = yAirPlane;
    }
}
