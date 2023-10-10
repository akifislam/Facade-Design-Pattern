import java.util.Random;

public abstract class Account implements IAccount {
    public int accountBalance = 0;

    @Override
    public void deposit(int amount) {
        accountBalance+=amount;
    }

    @Override
    public void withdraw(int amount) {
        accountBalance-=amount;
    }

    @Override
    public void transfer(IAccount toAccount, int amount) {
        this.accountBalance-=amount;
        toAccount.deposit(amount);
    }

    @Override
    public int getAccountNumber() {
        Random random = new Random();
        int newAccountNumber = random.nextInt(1000,1999);
        return newAccountNumber;
    }

    public abstract double getInterestRate(int amount);
}
