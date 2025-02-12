package org.thakur.lecture4.banking;

public enum InvestmentKind {
    bonds,
    fixedDeposit;

    @Override
    public String toString() {
        return switch (this) {
            case bonds -> "Bonds";
            case fixedDeposit -> "Fixed Deposit";
        };
    }
}
