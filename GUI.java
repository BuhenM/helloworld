package com.company.foo;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

    public static void main (String[] args){

        JFrame frame = new JFrame("yo" +
                "go");
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();



    }
}
