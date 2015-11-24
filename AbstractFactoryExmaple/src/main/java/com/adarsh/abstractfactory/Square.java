package com.adarsh.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: adarsh_k
 * Date: 2/14/14
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}