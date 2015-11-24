package com.adarsh.businessdelegate;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/13/14
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}