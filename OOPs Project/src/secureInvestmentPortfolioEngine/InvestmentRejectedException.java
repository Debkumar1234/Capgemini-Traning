package secureInvestmentPortfolioEngine;

public class InvestmentRejectedException extends RuntimeException{
	public InvestmentRejectedException(String message) {
		super(message);
	}
}
