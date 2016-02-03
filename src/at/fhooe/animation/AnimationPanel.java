package at.fhooe.animation;

/**
 * Created by alexandergattringer on 03/02/16.
 */
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class AnimationPanel extends JPanel {

    private static final int PAUSE = 20;
    private Rectangle rect;
    private Thread animationThread;

    public AnimationPanel() {
        rect = new Rectangle(0, 0, 30, 30);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(rect.x, rect.y, rect.width, rect.height);
    }
    public void start() {
        animationThread = new Thread(animator);
        animationThread.start();
    }
    public void stop() {
        animationThread.interrupt();

    }
    private Runnable animator = new Runnable() {
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    rect.x = (rect.x + 1) % getWidth();
                    rect.y = (rect.y + 1) % getHeight();
                    repaint();
                    Thread.sleep(PAUSE);
                }
            } catch (InterruptedException e) {
            }
        }
    };
}