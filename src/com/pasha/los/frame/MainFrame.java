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

    public MainFrame() {
        frame = new JFrame("PlaneWar");
        frame.setSize(new Dimension(AirModel.HEIGHT_SIZE, AirModel.WIDTH_SIZE));
        frame.setResizable(false);
        frame.setVisible(true);
        airModel = new AirModel();
        frame.add(airModel.getAirModelImage(), BorderLayout.CENTER);

    }
}
