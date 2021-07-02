package com.espark.adarsh;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Mailer {

    private static final List<Mailer> mailers=new LinkedList<>();
    private static Random random=new Random();
    private String name;
    static{
        mailers.add(new Mailer("mailer 1"));
        mailers.add(new Mailer("mailer 2"));
        mailers.add(new Mailer("mailer 3"));
        mailers.add(new Mailer("mailer 4"));
        mailers.add(new Mailer("mailer 5"));

    }

    private Mailer(String name) {
        this.name = name;
    }

    public Mailer to(String address){
        System.out.println("Perform by "+this.name+" address "+address);
        return this;
    }

    public Mailer subject(String subject){
        System.out.println("Perform by "+this.name+" subject "+subject);
        return this;
    }

    public Mailer body(String body){
        System.out.println("Perform by "+this.name+" body "+body);
        return this;
    }

    public Mailer from(String from){
        System.out.println("Perform by "+this.name+" from "+from);
        return this;
    }

    public static void send(Consumer<Mailer> block){
        Mailer mailer=mailers.get(random.nextInt(4));
        System.out.println("Perform by "+mailer.name+" send ");
        block.accept(mailer);
    }
}
