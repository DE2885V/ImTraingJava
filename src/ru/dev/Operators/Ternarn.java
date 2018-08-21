package ru.dev.Operators;

import javax.swing.*;

public class Ternarn {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("ВВедите число: "));
        String text = num % 2 == 0 ? "четное" : "нечетное";
        System.out.println(num);

        JOptionPane.showMessageDialog(null, "Вы ввели " + text + " число");
    }
}
