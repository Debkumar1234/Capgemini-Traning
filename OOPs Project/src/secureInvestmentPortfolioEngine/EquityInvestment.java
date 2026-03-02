package secureInvestmentPortfolioEngine;

public final class EquityInvestment extends InvestmentTransaction {
	public EquityInvestment(String transactionId, String investorName, double investedAmount) {
		super(transactionId, investorName, investedAmount, InvestmentType.Equity);
	}
	
	@Override
	public InvestmentTransaction applyAdjustment(double bonusPercentage) throws InvalidInvestmentException {
		if (bonusPercentage < 0 || bonusPercentage > 30) {
			throw new InvalidInvestmentException("Bonus must be between 0 and 30%");
		}

		double bonus = getInvestedAmount() * bonusPercentage / 100;
		return new EquityInvestment(getTransactionId(), getInvestorName(), getInvestedAmount() + bonus);
	}

	@Override
	public void authorize() {
		if (getInvestedAmount() < 5000) {
			throw new InvestmentRejectedException("Equity investment authorization failed");
		}
		System.out.println("Equity investment authorized");
	}

	@Override
	public void authorize(String securityCode) {
		if (!"EQT-SECURE".equals(securityCode)) {
			throw new InvestmentRejectedException("Invalid security code");
		}
		System.out.println("Equity investment authorized with security code");
	}
}
