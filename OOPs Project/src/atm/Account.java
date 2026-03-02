package atm;

public class Account {
	private int pin;
	private int limit = 3;
	Account(int pin){
		this.pin = pin;
	}
	public void withdraw(int pin) {
		if(this.pin != pin) {
			limit--;
			throw new InvalidPinException("Invalid PIN");
		}else {
			System.out.println("money withdrawn successfully");
			limit = 3;
		}
	}
	public int getLimit() {
		return this.limit;
	}
}
