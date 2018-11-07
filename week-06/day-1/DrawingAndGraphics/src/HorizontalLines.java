import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {

        int x1 = 130;
        int y1 = 80;
        int x2 = 130;
        int y2 = 160;
        int x3 = 130;
        int y3 = 240;

        ArrayList<Integer> startingPoint = new ArrayList<>(Arrays.asList(x1, y1, x2, y2 ,x3, y3));

        int x = 0;
        int y = 0;

        for (int i = 0; i <=2 ; i++) {
            x = startingPoint.get (i * 2);
            y = startingPoint.get(i * 2 + 1);
            Draw50LongLine(x, y, graphics);
        }
    }

    private static void Draw50LongLine(int x, int y, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x + 50, y, x, y);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
