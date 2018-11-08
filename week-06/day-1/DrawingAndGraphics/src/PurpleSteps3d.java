import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        int x = 5;
        int y = 5;
        int size = 8;

        for (int i = 0; i < 6; i++) {
            size = size + 9;
            drawPurpleSquares(x + i * size/2, y + i * size/2, size-3, graphics);
        }
    }

    public static void drawPurpleSquares ( int x2, int y2, int size2, Graphics graphics){
        graphics.setColor(new Color(129, 34, 141));
        graphics.fillRect(x2, y2, size2, size2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
