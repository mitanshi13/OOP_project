package project.edu;

public class Payment{
    public boolean processPayment(double amount, String paymentDetails) {
        System.out.println("Processing payment of $" + amount + " with details: " + paymentDetails);
        
        if (paymentDetails.contains("valid")) {
            if (paymentDetails.contains("invalid")) {
            	System.out.println("Invalid payment details");
            	return false;}
            else {
            	return true;}
        } 
        else {
            System.out.println("Unknown payment details");
            return false;
        }
    }
}
