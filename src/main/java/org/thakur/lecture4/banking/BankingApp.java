package org.thakur.lecture4.banking;

public class BankingApp {
    public static void main(String[] args) {
        final BankAccount savingsAccount = new SavingsAccount(450);
        final BankAccount checkingAccount = new CheckingAccount(360);

        System.out.println("Interest for: " + savingsAccount.getClass() + " is: " + savingsAccount.calculateInterest());
        System.out.println("Interest for: " + checkingAccount.getClass() + " is: " + checkingAccount.calculateInterest());

        final Investor bondsInvestor = new Investor() {
            @Override
            public InvestmentKind getInvestmentKind() {
                return InvestmentKind.bonds;
            }
        };

        bondsInvestor.investIn(checkingAccount);

        final Investor fixedDepositInvestor = new Investor() {
            @Override
            public InvestmentKind getInvestmentKind() {
                return InvestmentKind.fixedDeposit;
            }
        };

        fixedDepositInvestor.investIn(savingsAccount);
    }
}
