package valuableassets;

public class CheckingAccount implements BankAccount{

    double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
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
