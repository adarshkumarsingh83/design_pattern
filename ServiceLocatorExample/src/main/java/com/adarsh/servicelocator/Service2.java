package com.adarsh.servicelocator;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/13/14
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Service2 implements Service {

    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}