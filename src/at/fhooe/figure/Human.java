package at.fhooe.figure;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by alexandergattringer on 03/02/16.
 */
public class Human extends Figure {

    public Human(){
        ArrayList<Rectangle> shapes = new ArrayList<>();
        //head
        shapes.add(new Rectangle(100,0,100,100));
        //neck
        shapes.add(new Rectangle(125,100,50,25));
        //body
        shapes.add(new Rectangle(100,125,100,200));
        //feet
        shapes.add(new Rectangle(100,325,25,100));
        shapes.add(new Rectangle(175,325,25,100));
        //hands
        shapes.add(new Rectangle(0,125,100,25));
        shapes.add(new Rectangle(200,125,100,25));
        setShapes(shapes);
    }
}
