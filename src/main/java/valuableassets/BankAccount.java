package valuableassets;

public interface BankAccount extends Valuable{

    void deposit(double amount);

    boolean withdraw( double amount);

    double getBalance();

}
