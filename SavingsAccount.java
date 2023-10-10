public class SavingsAccount extends Account {
    @Override
    public int checkBalance() {
        return accountBalance;
    }

    @Override
    public double getInterestRate(int amount) {
        System.out.println("With 2.5% interest, your current balance is " +(amount+amount*0.025));
        return 0.025;
    }
}
