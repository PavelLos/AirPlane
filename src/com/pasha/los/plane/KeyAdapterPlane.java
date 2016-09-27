package com.pasha.los.plane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by pasha on 26.09.2016.
 */
public class KeyAdapterPlane extends KeyAdapter implements KeyListener {
    private int xPosition;
    private int xLength = 5;
    private AirPlaneModel airPlaneModel;

    public KeyAdapterPlane(AirPlaneModel airPlaneModel) {
        this.airPlaneModel = airPlaneModel;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = airPlaneModel.getxAirPlane();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            airPlaneModel.setxAirPlane(x + xLength);
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            airPlaneModel.setxAirPlane(x - xLength);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
