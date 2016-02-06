package at.fhooe.figure;

import at.fhooe.visitor.Visitor;
import at.fhooe.visitor.VisitorHandler;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by alexandergattringer on 03/02/16.
 */
public abstract class Figure implements VisitorHandler{
    private ArrayList<Rectangle> shapes;
    private int posX;
    private int posY;

    public void draw(Graphics2D graphics){
        for (Rectangle rect : shapes){
            graphics.draw(rect);
        }
    }

    @Override
    public void handleVisitor(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPosition(int x, int y){
        int deltaX = x - posX;
        int deltaY = y - posY;


        if (shapes != null) {
            for (Rectangle rect : shapes) {
                rect.setLocation(rect.x + deltaX, rect.y + deltaY);
            }
        }
        posX = x;
        posY = y;
    }

    public Point getLocation(){
        return new Point(posX, posY);
    }

    public void setShapes(ArrayList<Rectangle> shapes) {
        this.shapes = shapes;
    }
    public ArrayList<Rectangle> getShapes(){ return shapes; }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
