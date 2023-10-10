public class ChequingAccount extends Account {
    @Override
    public int checkBalance() {
        return accountBalance;
    }
    @Override
    public double getInterestRate(int amount) {
        System.out.println("With 0.5% interest, your current balance is " +(amount+amount*0.005));
        return 0.005;
    }
}
