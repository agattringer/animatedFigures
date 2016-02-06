package at.fhooe.decorator;

import at.fhooe.figure.Figure;

import java.awt.*;

/**
 * Created by alexandergattringer on 06/02/16.
 */
public class GreenLineDecorator extends Decorator{
    public GreenLineDecorator(Figure figure){
        super(figure);
    }

    @Override
    public void draw(Graphics2D graphics) {
        Color previousColor = graphics.getColor();
        graphics.setColor(Color.GREEN);
        super.draw(graphics);
        graphics.setColor(previousColor);
    }
}
