package at.fhooe.visitor;

import at.fhooe.figure.Horse;
import at.fhooe.figure.Human;

/**
 * Created by alexandergattringer on 03/02/16.
 */
public interface Visitor {
    public void visitHuman(Human human);
    public void visitHorse(Horse horse);
}
