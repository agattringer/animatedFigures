package at.fhooe.figure;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by alexandergattringer on 03/02/16.
 */
public class Dog extends Figure {
    public Dog(){
        ArrayList<Rectangle> shapes = new ArrayList<>();
        shapes.add(new Rectangle(0,100,175,50));
        shapes.add(new Rectangle(0,150,25,75));
        shapes.add(new Rectangle(50,150,25,75));
        shapes.add(new Rectangle(100,150,25,75));
        shapes.add(new Rectangle(150,150,25,75));

        shapes.add(new Rectangle(150,75,25,25));
        shapes.add(new Rectangle(150,40,75,35));
        setShapes(shapes);
    }
}
