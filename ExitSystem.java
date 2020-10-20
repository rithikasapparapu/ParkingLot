import java.util.concurrent.ThreadLocalRandom;

public class ExitSystem {
    double bill;
    //Let's use the unix time stamp as recorded at the entrance as an identifier for the parking spot
    void showBill(long timestamp){
        //searches for this time stamp in the array of parking spots and amounts the bill
        //assigns the amount to the variable bill
    }
    //If it's an electric vehicle and they used the charger
    //then we should also include that amount in the total bill


    //Making payment
    void cashPayment(double amount){
        if(bill == amount){
            System.out.println("Have a great day!");
        }
        else if(bill>amount){
            System.out.println("An amount of " + (bill - amount) + "must be paid");
        }
        else{
            System.out.println("Here's your change : " + (amount - bill));
            System.out.println("Have a great day!");
        }
    }
    void cardPayment(){
        System.out.println("Redirecting to your bank gateway...");
        while(!dummyRandomBank()){
            System.out.println("Transaction unsuccessful. Please try again.");
        }
        if(dummyRandomBank()){
            System.out.println("Transaction successful.");
        }
    }
    //Adding randomness to ver
    boolean dummyRandomBank(){
        double randomNum = ThreadLocalRandom.current().nextDouble();
        if(randomNum>=0.98){
            return false;
        }
        return true;
    }
}
