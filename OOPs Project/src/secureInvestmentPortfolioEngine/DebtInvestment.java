package secureInvestmentPortfolioEngine;

public final class DebtInvestment extends InvestmentTransaction{
	public DebtInvestment(
			String transactionId,
			String investorName,
			double investedAmount
	) {
		super(transactionId, investorName, investedAmount, InvestmentType.Debt);
	}
	
	@Override
	public InvestmentTransaction applyAdjustment(double taxPercentage) throws InvalidInvestmentException{
		if(taxPercentage<0 || taxPercentage>30) {
			throw new InvalidInvestmentException("Tax percentage must be between 0 and 30");
		}
		double tax = getInvestedAmount()*taxPercentage / 100;
		return new DebtInvestment(getTransactionId(), getInvestorName(), getInvestedAmount()-tax);
	}
	
	@Override
	public void authorize() {
		if(getInvestedAmount()>100000) {
			throw new InvestmentRejectedException("Debt investment exceeds limit");
		}
		System.out.println("Debt investment authorized.");
	}
	
	@Override
	public void authorize(String securityCode) {
		if(!"DEBT-LOCK".equals(securityCode)) {
			throw new InvestmentRejectedException("Invalid debt security code");
		}
		System.out.println("Debt investment authorized with security code");
	}

}
