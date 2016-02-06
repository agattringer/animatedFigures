package at.fhooe.main;

import at.fhooe.animation.AnimationPanel;
import at.fhooe.figure.Dog;
import at.fhooe.figure.Human;
import at.fhooe.visitor.MoveLeftVisitor;
import at.fhooe.visitor.MoveRightVisitor;

import javax.swing.*;

/**
 * Created by alexandergattringer on 03/02/16.
 */
public class Application {

    public static void main(String[] args){
        JFrame frame = new JFrame("Animated Figures");
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        AnimationPanel animationPanel = new AnimationPanel();
        frame.add(animationPanel);

        Human human = new Human();
        human.setPosition(100, 100);
        animationPanel.addFigure(human);

        Dog dog = new Dog();
        dog.setPosition(500, 300);
        animationPanel.addFigure(dog);

        animationPanel.addVisitor(new MoveLeftVisitor());
        animationPanel.addVisitor(new MoveRightVisitor());

        frame.setVisible(true);
        animationPanel.start();
    }

}
