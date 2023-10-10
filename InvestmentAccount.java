public class InvestmentAccount extends  Account{
    @Override
    public double getInterestRate(int amount) {
        System.out.println("With 7.5% interest, your current balance is " +(amount+amount*0.075));
        return 0.075;
    }

    @Override
    public int checkBalance() {
        return accountBalance;
    }
}
