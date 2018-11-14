import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int step = 20;
        int x = WIDTH / 2;
        int y = HEIGHT / 2;

        graphics.setColor(Color.GREEN);

        for (int i = 0; i < 15; i++) {
            drawGreenLines(0, step + i * step / 2, step + i * step / 2, y, graphics);
            drawPurpleLines(step + i * step / 2, 0, x, step + i * step / 2, graphics);

            drawGreenLines(x, step + i * step / 2, step + i * step / 2 + x, y, graphics);
            drawPurpleLines(step + i * step / 2 + x, 0, 2 * x, step + i * step / 2, graphics);

            drawGreenLines(0, step + i * step / 2 + y, step + i * step / 2, 2 * y, graphics);
            drawPurpleLines(step + i * step / 2, y, x, step + i * step / 2 + y, graphics);

            drawGreenLines(x, step + i * step / 2 + y, step + i * step / 2 + x, 2 * y, graphics);
            drawPurpleLines(step + i * step / 2 + x, y, 2 * x, step + i * step / 2 + y, graphics);
        }
    }

    public static void drawGreenLines(int x1, int y1, int x2, int y2, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x1, y1, x2, y2);
    }

    public static void drawPurpleLines(int x1, int y1, int x2, int y2, Graphics graphics) {
        graphics.setColor(new Color(180, 80, 220));
        graphics.drawLine(x1, y1, x2, y2);
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
