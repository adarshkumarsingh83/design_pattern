package com.adarsh.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/15/14
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}