package com.pasha.los.frame;

import com.pasha.los.GameConstants;
import com.pasha.los.air.road.AirGameField;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pasha on 26.09.2016.
 */
public class MainFrame {
    private JFrame frame;
    private AirGameField airGameField;

    public MainFrame(JFrame _frame) {
        frame = _frame;
        frame = new JFrame("PlaneWar");
        frame.setSize(new Dimension(GameConstants.WIDTH_SIZE, GameConstants.HEIGHT_SIZE));
        airGameField = new AirGameField();
        frame.add(airGameField, BorderLayout.CENTER);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
