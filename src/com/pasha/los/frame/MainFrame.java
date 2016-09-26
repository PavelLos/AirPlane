package com.pasha.los.frame;

import com.pasha.los.air.road.AirModel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pasha on 26.09.2016.
 */
public class MainFrame {
    private JFrame frame;
    private AirModel airModel;

    public MainFrame(JFrame _frame) {
        frame = _frame;
        frame = new JFrame("PlaneWar");

        airModel = new AirModel();
        frame.add(airModel);

    }
}
