package models.data;

public class ChargedAccount extends BankAccount {

    public ChargedAccount() {}

    public ChargedAccount(float balance) {
        super(balance);
    }

    public void deposit(float amount) {
        super.deposit(amount);
        this.balance -= 5;
    }

    public void withdraw(float amount) {
        super.withdraw(amount);
        this.balance -= 5;
    }

    @Override
    public String toString() {
        return "ChargedAccount #" + id + " : balance = " + balance + " €";
    }
}
