package at.fhooe.animation;

/**
 * Created by alexandergattringer on 03/02/16.
 */
import at.fhooe.figure.Figure;
import at.fhooe.visitor.Visitor;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class AnimationPanel extends JPanel {

    private Thread animationThread;
    private static final int PAUSE = 20;
    private static final int TOTAL_TIME = 2000;

    private ArrayList<Figure> figures;
    private ArrayList<Visitor> visitors;

    public AnimationPanel() {
        figures = new ArrayList<>();
        visitors = new ArrayList<>();
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public void addFigure(Figure figure){
        figures.add(figure);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Figure fig : figures){
            fig.draw((Graphics2D)g);
        }

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
                    if (!figures.isEmpty() && !visitors.isEmpty()) {

                        for (Visitor visitor : visitors) {
                            long startTime = System.currentTimeMillis();
                            long currentTime = 0;

                            while (currentTime < TOTAL_TIME) {
                                for (Figure figure : figures) {
                                    figure.handleVisitor(visitor);
                                }
                                try {
                                    Thread.sleep(PAUSE);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                repaint();
                                currentTime = System.currentTimeMillis() - startTime;
                            }
                        }
                    }
                    repaint();
                    Thread.sleep(PAUSE);
                }
            } catch (InterruptedException e) {
            }
        }
    };
}