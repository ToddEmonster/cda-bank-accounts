package models.data;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    protected static final AtomicInteger count = new AtomicInteger(0);
    protected int id;
    protected float balance;

    public BankAccount() {
        this(0);
    }

    public BankAccount(float balance) {
        this.id = count.incrementAndGet();
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount #" + id + " : balance = " + balance + " €";
    }
}
