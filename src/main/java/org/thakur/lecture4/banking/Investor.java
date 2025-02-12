package org.thakur.lecture4.banking;

public interface Investor {
    default void investIn(final BankAccount account) {
        final float newBalance;
        if (account.calculateInterest() <= 0.0000001f) {
            newBalance = account.getBalance();
        } else {
            newBalance = account.getBalance() + account.calculateInterest();
        }
        System.out.println(account.getClass() + " invests in: " + getInvestmentKind().toString() + " with: " + newBalance);
    }

    InvestmentKind getInvestmentKind();
}
