# SOLID DESIGN PRINCIPLE

---

## S Single Responsibility Principle
	* a class should only have one responsibility. Furthermore, it should only have one reason to change.

```
public class BankService {

    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }
}

public class LoanService {

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }
}

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //write logic using twillio API
        }
    }
}

public class PrinterService {

    public void printPassbook() {
        //update transaction info in passbook
    }
}

```

## O Open and Close Principle
	*  classes should be open for extension but closed for modification. 

```
public interface NotificationService {

    public void sendOtp(String medium);

    public void sendTransactionReport(String medium);

}

public class EmailNotificationService implements NotificationService {
    public void sendOtp(String medium) {
        //write logic to integrate with email api
    }

    public void sendTransactionReport(String medium) {
        //write logic to integrate with email api
    }
}
public class MobileNotificationService implements NotificationService {
    public void sendOtp(String medium) {
        //write the logic to send otp to mobile
        //twillo api
    }

    public void sendTransactionReport(String medium) {
        //write the logic to send otp to mobile
        //twillo api
    }
}

public class WhatsAppNotificationService implements NotificationService {

    public void sendOtp(String medium) {
        //logic to integrate whatsapp api
    }

    public void sendTransactionReport(String medium) {
       //logic to integrate whatsapp api
    }
}
```

## L Leskov's Subsitution Principle
	* if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program

```
public interface SocialMedia {

    public   void chatWithFriend();

    public   void sendPhotosAndVideos();

}

public interface PostMediaManager {

    public  void publishPost(Object post);
}

public interface SocialVideoCallManager {
    public void groupVideoCall(String... users);
}

public class WhatsApp implements SocialMedia,SocialVideoCallManager {
    public void chatWithFriend() {
    }

    public void sendPhotosAndVideos() {
    }

    public void groupVideoCall(String... users) {
    }
}

public class Instagram implements SocialMedia,PostMediaManager{

    public void publishPost(Object post) {
    }

    public void chatWithFriend() {
    }

    public void sendPhotosAndVideos() {
    }
}

```


## I Interface Segregation Principle
	* larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

```
public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();

}

public interface CashBackManager {

    public void getCashBackAsCreditBalance();
}

public class GooglePay implements UPIPayments,CashBackManager {

    public void payMoney() {
    }

    public void getScratchCard() {
    }

    public void getCashBackAsCreditBalance() {
      //this features is there in gpay
    }
}

public class Paytm implements UPIPayments {

    public void payMoney() {
    }

    public void getScratchCard() {
    }
}

public class PhonePay implements UPIPayments {
    public void payMoney() {
    }

    public void getScratchCard() {
    }
}

```

## Dependency Inversion Principle
	* The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions

```
public interface CardService {

    public void doTransaction(long amount);
}

public class CreditCardService implements CardService {

    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}

public class DebitCardService implements CardService {

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}

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
```




