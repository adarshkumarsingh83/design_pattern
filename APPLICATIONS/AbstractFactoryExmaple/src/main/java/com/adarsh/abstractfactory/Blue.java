package com.adarsh.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: adarsh_k
 * Date: 2/14/14
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}