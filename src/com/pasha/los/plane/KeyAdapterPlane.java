package com.pasha.los.plane;

import com.pasha.los.air.road.AirGameField;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by pasha on 26.09.2016.
 */
public class KeyAdapterPlane extends KeyAdapter implements KeyListener {
    private int xPosition;
    private int xLength = 15;
    private AirPlaneModel airPlaneModel;

    public KeyAdapterPlane(AirPlaneModel airPlaneModel) {
        this.airPlaneModel = airPlaneModel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        xPosition = 0;
        int x = airPlaneModel.getxAirPlane();
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xPosition += xLength;
            airPlaneModel.setxAirPlane(x + xPosition);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xPosition -= xLength;
            airPlaneModel.setxAirPlane(x + xPosition);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
