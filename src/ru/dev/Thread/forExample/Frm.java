package ru.dev.Thread.forExample;

import javax.swing.*;

public class Frm extends JFrame {

    Frm(){
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Cnv c = new Cnv();
        add(c);
    }

}
