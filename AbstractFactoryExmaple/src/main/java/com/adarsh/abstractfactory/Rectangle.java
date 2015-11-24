package com.adarsh.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: adarsh_k
 * Date: 2/14/14
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}