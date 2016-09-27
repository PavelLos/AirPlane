package com.pasha.los.air.road;

import com.pasha.los.GameConstants;
import com.pasha.los.plane.AirPlaneModel;
import com.pasha.los.plane.KeyAdapterPlane;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pasha on 26.09.2016.
 */
public class AirGameField extends JPanel {
    private Image airModelImage;


    private AirPlaneModel airPlaneModel;
    private MovementOfAirField movementOfAirField;
    private KeyAdapterPlane keyAdapterPlane;

    public AirGameField() {
        airModelImage = Toolkit.getDefaultToolkit().getImage("images\\air.png");
        airPlaneModel = new AirPlaneModel();
        movementOfAirField = new MovementOfAirField(this, airPlaneModel);
        keyAdapterPlane = new KeyAdapterPlane(airPlaneModel);
    }

    public Image getAirModelImage() {
        return airModelImage;
    }

    @Override
    public void paint(Graphics g) {
        if (movementOfAirField.getyAirPositionSecond() >= GameConstants.HEIGHT_SIZE - GameConstants.HEIGHT_OF_ROAD) {
            movementOfAirField.setyAirPositionFirst(GameConstants.HEIGHT_SIZE - GameConstants.HEIGHT_OF_ROAD);
            movementOfAirField.setyAirPositionSecond(GameConstants.HEIGHT_SIZE - 2 * GameConstants.HEIGHT_OF_ROAD);
        }
        g.drawImage(airModelImage, 0, movementOfAirField.getyAirPositionFirst(), null);
        g.drawImage(airModelImage, 0, movementOfAirField.getyAirPositionSecond(), null);
        g.drawImage(airPlaneModel.getPlaneImage(), airPlaneModel.getxAirPlane(), airPlaneModel.getyAirPlane(), null);
        repaint();
    }
}
