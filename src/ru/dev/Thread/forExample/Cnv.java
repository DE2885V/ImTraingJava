package ru.dev.Thread.forExample;

import javax.swing.plaf.basic.BasicLookAndFeel;
import java.awt.*;

public class Cnv extends Canvas {

    private int x;// = 25;
    private int y;// = 25;


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void paint(Graphics g){
        g.drawString("Hello", x, y);


    }
}
