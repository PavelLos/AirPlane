package com.pasha.los.Bombs;

import java.awt.*;

/**
 * Created by pasha on 28.09.2016.
 */
public class Bomb {
    private int xPosition;
    private int yFirst;
    private int ySecond;
    private int heightBomb = 50;
    private int weightBomb = 25;
    private int speedBomb = 2;
    private boolean boom;

    private Image bombImage;

    public Bomb(int x, int y) {
        boom = false;
        bombImage = Toolkit.getDefaultToolkit().getImage("images\\bomb.png");
        xPosition = x+x/6;
        yFirst = y - heightBomb / 2;
        ySecond = yFirst - yFirst/4;
    }

    public void move() {
        if (yFirst >= ySecond) {
            yFirst -= speedBomb;
        }
        else
            boom = true;
    }

    public boolean isBoom() {
        return boom;
    }

    public Image getBombImage() {
        return bombImage;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyFirst() {
        return yFirst;
    }
}
