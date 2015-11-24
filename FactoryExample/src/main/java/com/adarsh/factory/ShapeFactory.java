package com.adarsh.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/13/14
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}