package secureInvestmentPortfolioEngine;

public interface Authorizable {
	void authorize();
	void authorize(String securityCode);
}
