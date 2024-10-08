public class BankManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws Exception{
        if (getBalance() >=amount) {
            balance = getBalance() - amount;
        }else{
            throw new Exception("Yetersiz bakiye");
        }
    }

    public double getBalance() {
        return balance;
    }
}
