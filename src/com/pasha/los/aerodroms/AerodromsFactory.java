package com.pasha.los.aerodroms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by pasha on 28.09.2016.
 */
public class AerodromsFactory extends Thread {
    private List<Aerodrome> aerodromeList;

    private int numberOfAerodroms = 2;

    public AerodromsFactory() {
        aerodromeList = new ArrayList<Aerodrome>(numberOfAerodroms);
        //Thread creationAerodrome = new Thread(this);
        start();
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(3000));
                Aerodrome aerodrome = new Aerodrome();
                if (aerodromeList.size() < numberOfAerodroms)
                    aerodromeList.add(aerodrome);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Aerodrome> getAerodromeList() {
        return aerodromeList;
    }
}
