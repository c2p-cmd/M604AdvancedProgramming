package org.thakur.lecture4.banking;

public class BondsInvestor implements Investor {
    @Override
    public InvestmentKind getInvestmentKind() {
        return InvestmentKind.bonds;
    }
}
