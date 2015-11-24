package com.adarsh.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/15/14
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
