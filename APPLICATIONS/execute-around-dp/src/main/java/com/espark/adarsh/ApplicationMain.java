package com.espark.adarsh;


public class ApplicationMain {

    public static void main(String[] args) {

        Resource.use("db", resource -> resource.optimizing().doWork());
        System.out.println();
        Resource.use("jms", resource -> resource.optimizing().doWork());
        System.out.println();
        Resource.use("file", resource -> resource.optimizing().doWork());
    }
}
