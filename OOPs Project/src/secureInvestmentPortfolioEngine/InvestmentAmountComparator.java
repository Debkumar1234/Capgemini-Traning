package secureInvestmentPortfolioEngine;
import java.util.Comparator;

class InvestmentAmountComparator implements Comparator<InvestmentTransaction>{
	@Override
	public int compare(InvestmentTransaction a, InvestmentTransaction b) {
		return (int) (a.getInvestedAmount() - b.getInvestedAmount());
	}
}
