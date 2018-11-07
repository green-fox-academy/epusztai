import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics) {

        int size = 50;

        for (int i = 0; i < 3; i++) {
            drawSquare(size, graphics);
            size = size + 50;
        }
    }

    public static void drawSquare(int size2, Graphics graphics2 ) {
        Color color = new Color((int)(Math.random()* 256), (int)(Math.random()* 256), (int)(Math.random()* 256));
        graphics2.setColor(color);
        graphics2.drawRect(WIDTH/2 - size2/2, HEIGHT/2 - size2/2, size2, size2);
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
