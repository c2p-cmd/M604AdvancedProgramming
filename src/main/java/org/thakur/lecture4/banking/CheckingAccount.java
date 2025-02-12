package org.thakur.lecture4.banking;

public class CheckingAccount extends BankAccount {
    CheckingAccount(final float initialBalance) {
        super(initialBalance);
    }

    @Override
    Float calculateInterest() {
        return getBalance() * CheckingAccount.getInterestRate();
    }

    public static Float getInterestRate() {
        return 0f;
    }
}
