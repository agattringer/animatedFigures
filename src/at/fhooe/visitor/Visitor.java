package at.fhooe.visitor;

import at.fhooe.figure.Figure;

/**
 * Created by alexandergattringer on 03/02/16.
 */
public interface Visitor {
    public void visit(Figure figure);
}
