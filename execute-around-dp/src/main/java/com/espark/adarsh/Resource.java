package com.espark.adarsh;

import java.util.function.Consumer;

public class Resource {

    private String name;

    private Resource(String name) {
        this.name = name;
        System.out.println("Resource  created " + this.name);
    }

    public Resource optimizing() {
        System.out.println("Optimizing  payload ");
        return this;
    }
    public Resource doWork() {
        System.out.println("Doing work using "+this.name);
        return this;
    }

    private void close() {
        System.out.println("Resource closing " + this.name);
    }

    public static void use(String name,Consumer<Resource> block){
        Resource resource=new Resource(name);
        try{
            block.accept(resource);
        }finally {
            resource.close();
        }
    }
}
