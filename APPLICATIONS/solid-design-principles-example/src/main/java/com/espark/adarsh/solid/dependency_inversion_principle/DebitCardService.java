package com.espark.adarsh.solid.dependency_inversion_principle;

public class DebitCardService implements CardService {

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}
