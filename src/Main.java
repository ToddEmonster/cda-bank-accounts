import models.data.BankAccount;
import models.data.ChargedAccount;
import models.data.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        ChargedAccount chargedAccount = new ChargedAccount();

        bankAccount.deposit(50);
        savingsAccount.deposit(300);
        chargedAccount.deposit(100);

        bankAccount.withdraw(10);
        savingsAccount.withdraw(150);
        chargedAccount.withdraw(25);

        savingsAccount.interestCalculation();

        System.out.println(bankAccount);
        System.out.println(savingsAccount);
        System.out.println(chargedAccount);
    }
}
