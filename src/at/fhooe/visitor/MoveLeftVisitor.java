package at.fhooe.visitor;

import at.fhooe.figure.Figure;

/**
 * Created by alexandergattringer on 06/02/16.
 */
public class MoveLeftVisitor implements Visitor {
    @Override
    public void visit(Figure figure) {
        figure.setPosition(figure.getLocation().x - 1, figure.getLocation().y);
    }
}
