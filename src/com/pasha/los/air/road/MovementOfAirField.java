package com.pasha.los.air.road;

import com.pasha.los.GameConstants;
import com.pasha.los.plane.AirPlaneModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pasha on 27.09.2016.
 */
public class MovementOfAirField implements ActionListener{
    private Timer timer;
    private AirPlaneModel airPlaneModel;
    private AirGameField airGameField;

    private int yAirPositionFirst;
    private int yAirPositionSecond;

    public MovementOfAirField(AirGameField _airGameField, AirPlaneModel _airPlaneModel) {
        yAirPositionFirst = GameConstants.HEIGHT_SIZE - GameConstants.HEIGHT_OF_ROAD;
        yAirPositionSecond = yAirPositionFirst - GameConstants.HEIGHT_OF_ROAD;
        timer = new Timer(20, this);
        airPlaneModel = _airPlaneModel;
        airGameField = _airGameField;
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        airGameField.repaint();
    }

    private void move(){
        yAirPositionFirst += airPlaneModel.getSpeedOfAirPlane();
        yAirPositionSecond += airPlaneModel.getSpeedOfAirPlane();
    }

    public int getyAirPositionFirst() {
        return yAirPositionFirst;
    }

    public void setyAirPositionFirst(int yAirPositionFirst) {
        this.yAirPositionFirst = yAirPositionFirst;
    }

    public int getyAirPositionSecond() {
        return yAirPositionSecond;
    }

    public void setyAirPositionSecond(int yAirPositionSecond) {
        this.yAirPositionSecond = yAirPositionSecond;
    }
}
