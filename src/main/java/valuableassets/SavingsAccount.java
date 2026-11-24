package valuableassets;

public class SavingsAccount implements BankAccount{

    double balance;
    private static double interestRate = .033;

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public boolean withdraw(double amount) {

        if(balance>=amount){
            balance = balance - amount;
            return true;
        }else{
            return false;
        }

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
