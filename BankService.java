public class BankService implements IAccount {

    public IAccount myAccount;
    public void createAccount(String accountType) {

        IAccount newAccount;

        if (accountType.equalsIgnoreCase("Chequing"))
            newAccount = new ChequingAccount();


        else if (accountType.equalsIgnoreCase("Savings"))
            newAccount = new SavingsAccount();


        else
            newAccount = new InvestmentAccount();


        showNewAccountMsg(accountType, newAccount);
        this.myAccount = newAccount;
    }

    public void showNewAccountMsg(String accountType, IAccount newAccount) {
        System.out.println("==============================");
        System.out.println("New " + accountType + " Account is initiated.");
        System.out.println("Your A/C No is " + newAccount.getAccountNumber());
        System.out.println("Your Initial Balance is " +newAccount.checkBalance());
        System.out.println("==============================");
    }

    @Override
    public int checkBalance() {
        int balance = myAccount.checkBalance();
        System.out.printf("Your Balance is now : " +balance + " Taka\n\n");
        return balance;
    }

    @Override
    public void deposit(int amount) {

        myAccount.deposit(amount);
        System.out.println("Deposited "+amount);
    }

    @Override
    public void withdraw(int amount) {

        System.out.println("Withdrawn " +amount);
        myAccount.withdraw(amount);
    }

    @Override
    public void transfer(IAccount toAccount, int amount) {
        myAccount.transfer(toAccount,amount);
    }

    @Override
    public int getAccountNumber() {
        return myAccount.getAccountNumber();
    }
}
