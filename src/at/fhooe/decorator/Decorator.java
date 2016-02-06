package at.fhooe.decorator;

import at.fhooe.figure.Figure;
import at.fhooe.visitor.Visitor;

import java.awt.*;

/**
 * Created by alexandergattringer on 06/02/16.
 */
public class Decorator extends Figure {
    public Figure figure;

    public Decorator(Figure figure){
        this.figure = figure;
        setPosition(figure.getLocation().x, figure.getLocation().y);
    }

    @Override
    public void draw(Graphics2D graphics) {
        figure.draw(graphics);
    }

    @Override
    public void handleVisitor(Visitor visitor) {
        visitor.visit(figure);
        figure.handleVisitor(visitor);
    }
}
