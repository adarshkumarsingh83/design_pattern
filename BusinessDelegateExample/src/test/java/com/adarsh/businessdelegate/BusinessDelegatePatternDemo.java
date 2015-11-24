package com.adarsh.businessdelegate;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/13/14
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
