package org.thakur.lecture4.banking;

public class FixedDepositInvestor implements Investor {
    @Override
    public InvestmentKind getInvestmentKind() {
        return InvestmentKind.fixedDeposit;
    }
}
