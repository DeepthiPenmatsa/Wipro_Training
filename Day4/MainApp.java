package Day4;

import Day4.CreditCardPayment;
import Day4.UpiPayment;
import Day4.BillGenerator;

public class MainApp {
    public static void main(String[] args) {
        // Abstract Class Demo
        CreditCardPayment ccp = new CreditCardPayment(5000);
        ccp.makePayment();

        UpiPayment upi = new UpiPayment(1500);
        upi.makePayment();

        // Interface + Lambda Demo
        BillGenerator.displayHeader();  // static method from interface

        BillGenerator bill = (amount) -> {
            System.out.println("Amount: ₹" + amount);
            System.out.println("Thank you for your payment!");
        };

        bill.showBillFormat();  // default method
        bill.generate(6500);    // lambda expression used
    }
}

