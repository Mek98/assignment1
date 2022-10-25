import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account () {

    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account (int id, double balance){
        this.id = id;
        this.balance= balance;
    }

    public Date getDateCreated() {
        return dateCreated;

    }



    public double getMonthlyInterestRate (){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest ()
    {
        return (balance * getMonthlyInterestRate())*100;
    }
    public void withdraw (double x){
        balance = balance - x;

    }

    public void deposit (double x){
        balance = balance + x;

    }


}
