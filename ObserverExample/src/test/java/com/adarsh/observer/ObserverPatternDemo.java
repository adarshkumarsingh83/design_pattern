package com.adarsh.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/15/14
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}