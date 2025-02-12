package org.thakur.lecture4.banking;

public abstract class BankAccount {
    private float balance;

    BankAccount(final float initialBalance) {
        this.balance = initialBalance;
    }

    public Float getBalance() {
        return this.balance;
    }

    // should be overridden
    abstract Float calculateInterest();

    // default methods
    public void deposit(final float amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        this.balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void withdraw(final float amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (amount > getBalance()) {
            System.out.println("Cannot withdraw more than balance!");
            return;
        }

        this.balance -= amount;
    }
}
