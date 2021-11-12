package com.espark.adarsh.solid.dependency_inversion_principle;

public class CreditCardService implements CardService {

    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}
