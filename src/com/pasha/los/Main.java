package com.pasha.los;

import com.pasha.los.air.road.AirModel;
import com.pasha.los.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();
        MainFrame mainFrame = new MainFrame(frame);
        frame.setSize(new Dimension(AirModel.HEIGHT_SIZE, AirModel.WIDTH_SIZE));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
