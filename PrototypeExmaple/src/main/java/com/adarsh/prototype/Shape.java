package com.adarsh.prototype;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/15/14
 * Time: 1:35 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}