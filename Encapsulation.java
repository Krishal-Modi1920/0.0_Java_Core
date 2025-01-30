public class Encapsulation {
    private double balance = 10000;

    // Deposite Amount
    public double getBalance(double balance)
    {
        return balance;
    }

    public void setBalance(int deposit_amount)
    {
        balance = deposit_amount + balance;
        System.out.println("Amount Deposited : " + deposit_amount);
        System.out.println("Balance : " + balance);
    }

    // Withdraw Amount
    public void setwithdraw(int withdraw_amount)
    {
        balance = balance - withdraw_amount;
        System.out.println("Amount Deposited : " + withdraw_amount);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setBalance(1000);
        obj.setwithdraw(5000);
    }
}
