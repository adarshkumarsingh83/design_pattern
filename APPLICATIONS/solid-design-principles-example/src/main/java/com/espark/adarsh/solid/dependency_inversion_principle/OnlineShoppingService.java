package com.espark.adarsh.solid.dependency_inversion_principle;

public class OnlineShoppingService {

    private CardService bankCard;

    public OnlineShoppingService(CardService bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
       // DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();

        CardService cardService=new CreditCardService();
        OnlineShoppingService onlineShoppingService =new OnlineShoppingService(cardService);
        onlineShoppingService.doPurchaseSomething(5000);
    }
}
