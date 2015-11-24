package com.adarsh.chainofresponsiblity;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/15/14
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}