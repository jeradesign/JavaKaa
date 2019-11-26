package com.jera.kaa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main(String windowTitle) {
        super(windowTitle);
        setContentPane(new DrawPane());
    }

    class DrawPane extends JPanel {
        int count = 0;
        public void paintComponent(Graphics g) {
            if (count % 3 == 0) {
                g.setColor(Color.GREEN);
            } else if (count % 3 == 1) {
                g.setColor(Color.ORANGE);
            } else {
                g.setColor(Color.BLUE);
            }
            g.fillOval(20, 20, 200, 200);
            count++;
        }
    }

    public static void main(String[] args) {
        Main frame = new Main("Kaa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        int delay = 33; //milliseconds
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                frame.repaint();
            }
        };
        new Timer(delay, taskPerformer).start();
    }
}
