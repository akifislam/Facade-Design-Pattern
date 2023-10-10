public interface IAccount {
    public void deposit(int amount);
    public int checkBalance();
    public void withdraw(int amount);

    void transfer(IAccount toAccount, int amount);

    public int getAccountNumber();


}
