package com.adarsh.template;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/13/14
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
