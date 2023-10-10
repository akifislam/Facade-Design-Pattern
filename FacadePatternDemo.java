
public class FacadePatternDemo {
    public static void main(String[] args) {

        // Creating My Bank Account, Deposit 5000, Withdraw 1400
        BankService myBankService = new BankService();
        myBankService.createAccount("Savings");
        myBankService.deposit(5000);
        myBankService.checkBalance();

        myBankService.withdraw(1400);
        myBankService.checkBalance();

        // Transfer Money from My Account to Another Account
        System.out.println("\n\n**AnotherAccount Logged In**");
        BankService anotherBankService = new BankService();
        anotherBankService.createAccount("Investment");
        myBankService.transfer(anotherBankService,3000);
        anotherBankService.checkBalance();
    }
}