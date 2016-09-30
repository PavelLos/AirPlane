package com.pasha.los.Bombs;

import com.pasha.los.plane.AirPlaneModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pasha on 28.09.2016.
 */
public class KeyAdapterBombs extends KeyAdapter {

    private Bomb bomb;
    private AirPlaneModel airPlaneModel;
    private List<Bomb> bombList;

    public KeyAdapterBombs(AirPlaneModel airPlaneModel) {
        this.airPlaneModel = airPlaneModel;
        bombList = new ArrayList<>();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            bomb = new Bomb(airPlaneModel.getxAirPlane(), airPlaneModel.getyAirPlane());
            bombList.add(bomb);
        }
    }

    public List<Bomb> getBombList() {
        return bombList;
    }
}
