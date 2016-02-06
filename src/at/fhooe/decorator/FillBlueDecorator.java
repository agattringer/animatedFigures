package at.fhooe.decorator;

import at.fhooe.figure.Figure;

import java.awt.*;

/**
 * Created by alexandergattringer on 06/02/16.
 */
public class FillBlueDecorator extends Decorator{
    public FillBlueDecorator(Figure figure){
        super(figure);
    }

    @Override
    public void draw(Graphics2D graphics) {
        Color previousColor = graphics.getColor();
        graphics.setColor(Color.BLUE);

        for (Shape shape : figure.getShapes()){
            graphics.fill(shape);
        }

        graphics.setColor(previousColor);
    }
}
