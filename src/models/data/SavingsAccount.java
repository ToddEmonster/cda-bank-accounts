package models.data;

public class SavingsAccount extends BankAccount {
    private static final int interestRate = 6;

    public SavingsAccount() {}

    public SavingsAccount(float balance) {
        super(balance);
    }

    public void interestCalculation() {
        this.balance += this.balance * interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount #" + id + " : balance = " + balance + " €";
    }
}
