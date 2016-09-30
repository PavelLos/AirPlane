package com.pasha.los.air.road;

import com.pasha.los.Bombs.Bomb;
import com.pasha.los.Bombs.KeyAdapterBombs;
import com.pasha.los.GameConstants;
import com.pasha.los.aerodroms.Aerodrome;
import com.pasha.los.aerodroms.AerodromsFactory;
import com.pasha.los.plane.AirPlaneModel;
import com.pasha.los.plane.KeyAdapterPlane;

import javax.swing.*;
import java.awt.*;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/**
 * Created by pasha on 26.09.2016.
 */
public class AirGameField extends JPanel {
    private Image airModelImage;


    private AirPlaneModel airPlaneModel;
    private MovementOfAirField movementOfAirField;
    private KeyAdapterPlane keyAdapterPlane;
    private KeyAdapterBombs keyAdapterBombs;
    private AerodromsFactory aerodromsFactory;
    private ListIterator<Aerodrome> aerodromeIterator;
    private ListIterator<Bomb> bombListIterator;


    public AirGameField() {
        airModelImage = Toolkit.getDefaultToolkit().getImage("images\\air.png");
        airPlaneModel = new AirPlaneModel();
        movementOfAirField = new MovementOfAirField(this, airPlaneModel);
        keyAdapterPlane = new KeyAdapterPlane(airPlaneModel);
        keyAdapterBombs = new KeyAdapterBombs(airPlaneModel);
        this.addKeyListener(keyAdapterPlane);
        this.addKeyListener(keyAdapterBombs);
        setFocusable(true);
        aerodromsFactory = new AerodromsFactory();
    }

    public Image getAirModelImage() {
        return airModelImage;
    }

    @Override
    public void paint(Graphics g) throws java.util.ConcurrentModificationException {
        Graphics2D g2 = (Graphics2D) g;
        if (movementOfAirField.getyAirPositionSecond() >= GameConstants.HEIGHT_SIZE - GameConstants.HEIGHT_OF_ROAD) {
            movementOfAirField.setyAirPositionFirst(GameConstants.HEIGHT_SIZE - GameConstants.HEIGHT_OF_ROAD);
            movementOfAirField.setyAirPositionSecond(GameConstants.HEIGHT_SIZE - 2 * GameConstants.HEIGHT_OF_ROAD);
        }
        g2.drawImage(airModelImage, 0, movementOfAirField.getyAirPositionFirst(), null);
        g2.drawImage(airModelImage, 0, movementOfAirField.getyAirPositionSecond(), null);

        aerodromeIterator = (ListIterator<Aerodrome>) aerodromsFactory.getAerodromeList().listIterator();
        while (aerodromeIterator.hasNext()){
            Aerodrome aerodrome =  aerodromeIterator.next();
            if(aerodrome.getyAerodrome()>=  900)
                aerodromeIterator.remove();
            else {
                aerodrome.move(airPlaneModel.getSpeedOfAirPlane() - 4);
                g2.drawImage(aerodrome.getAerodromeImage(),
                        aerodrome.getxAerodrome(),
                        aerodrome.getyAerodrome(),
                        null);
                g2.drawRect((int)aerodrome.getAerodrmeBorder().getX(), (int)aerodrome.getAerodrmeBorder().getY(),
                        (int)aerodrome.getAerodrmeBorder().getWidth(), (int)aerodrome.getAerodrmeBorder().getHeight());
            }
        }
        g2.drawImage(airPlaneModel.getPlaneImage(), airPlaneModel.getxAirPlane(), airPlaneModel.getyAirPlane(), null);
        bombListIterator = keyAdapterBombs.getBombList().listIterator();
        System.out.println(keyAdapterBombs.getBombList().size());
        if(bombListIterator.hasNext()){
            Bomb bomb = bombListIterator.next();
            if(bomb.isBoom())
                bombListIterator.remove();
            else{
                bomb.move();
                g2.drawImage(bomb.getBombImage(), bomb.getxPosition(), bomb.getyFirst(), null);
            }
        }
        repaint();
    }



}
