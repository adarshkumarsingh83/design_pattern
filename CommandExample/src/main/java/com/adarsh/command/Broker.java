package com.adarsh.command;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/13/14
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}