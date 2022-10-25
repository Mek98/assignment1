import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Account Acc1 = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5/100);
        Acc1.withdraw(2500);
        Acc1.deposit(3000);
        Acc1.getDateCreated();
        System.out.println("Balance: " +Acc1.getBalance()+ " Monthly Interest: " + Acc1.getMonthlyInterest()+ " Date: "+ Acc1.getDateCreated() );
    }
}