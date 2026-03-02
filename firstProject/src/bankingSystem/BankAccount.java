package bankingSystem;

public abstract class BankAccount {
	private int accNum;
	private String name;
	private int balance;
	private int pin;
	private String typeOfAcc;
	public int getAccNum(int pin) throws WrongPinException{
		if(this.pin == pin) {
			return accNum;
		}
		throw new WrongPinException("Wrong Pin");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name, int pin) throws WrongPinException{
		if(this.pin == pin) {
			this.name = name;
			System.out.println("Name change successful");
		}
		throw new WrongPinException("Wrong Pin");
		
	}
	public int getBalance(int pin) throws WrongPinException{
		if(this.pin == pin) {
			return balance;
		}
		throw new WrongPinException("Wrong Pin");
	}
	public String getTypeOfAcc() {
		return typeOfAcc;
	}
	public BankAccount(int accNum, String name, int balance, int pin, String typeOfAcc) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.typeOfAcc = typeOfAcc;
	}
	public void withdraw(int amount, int pin) throws InvalidAmountException, InsufficientBalanceException {
		if(this.pin == pin) {
			if(amount<=0) {
				throw new InvalidAmountException("Invalid Amount");
//				System.out.println("InvalidAmountException");
//				return;
			}
			if(this.balance<amount) {
				throw new InsufficientBalanceException("Insufficient Balace");
//				System.out.println("InsufficientBalanceException");
			}else {
				System.out.println(amount+" debited successfully in account "+this.accNum+". Remaining balance : "+(this.balance-amount));
				this.balance -= amount;
			}
		}else {
			System.out.println("Wrong Pin");
		}
	}
	public void deposit(int amount, int pin) throws InvalidAmountException, InsufficientBalanceException{
		if(this.pin == pin) {
			if(amount<=0) {
				throw new InvalidAmountException("Invalid Amount");
//				System.out.println("InvalidAmountException");
//				return;
			}
			this.balance += amount;
			System.out.println("Balance credited with amount : "+amount+" in account : "+this.accNum);
			System.out.println("Current balance : "+ this.balance);
		}else {
			System.out.println("Wrong Pin");
		}
	}
}
