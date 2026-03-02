package bankingSystem;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Bank bank = new Bank();
		boolean flag = true;
		do {
			BankAccount account = null;
			int choice = -1;
			System.out.println("which operation do you want : ");
			System.out.println("1. press 1 for account creation");
			System.out.println("Press anything else to exit from bank.");
			choice = userInput.nextInt();
			userInput.nextLine();
			switch (choice) {
			case 1:
				String name;
				System.out.println("Enter your name : ");
				name = userInput.nextLine();
				int amount;
				System.out.println("Enter the opening amount : ");
				amount = userInput.nextInt();
				userInput.nextLine();
				System.out.println("Enter your pin : ");
				int pin = userInput.nextInt();
				userInput.nextLine();
				String accountType;
				System.out.println("Which type of account you want 1. Savings OR 2. Current. Press 1 or 2");
				int accChoice = userInput.nextInt();
				if (accChoice == 1) {
					accountType = "Savings";
				} else {
					accountType = "Current";
				}
				account = bank.createAccount(accountType, name, amount, pin);
				break;
			default:
				System.out.println("Terminate from bank...Thank you for visiting our bank");
				flag = false;
				break;
			}
			if (flag) {
				boolean flag1 = true;
				while (flag) {
					int operation;

					System.out.println("which operation you want to perform : ");
					System.out.println("1. press 1 for balance check ");
					System.out.println("2. press 2 for see account number");
					System.out.println("3. press 3 for change name");
					System.out.println("4. press 4 for withdraw");
					System.out.println("5. press 5 for deposit");
					System.out.println("6. press 6 for know the type of your account");
					System.out.println("7. press 7 for exit the operation.");
					operation = userInput.nextInt();
					userInput.nextLine();
					System.out.println("Enter your pin : ");
					int pin = userInput.nextInt();
					userInput.nextLine();
					switch (operation) {
					case 1:
						int balance;
						try {
							balance = account.getBalance(pin);
							if (balance >= 0) {
								System.out.println("Balance : " + balance);
							}
						} catch (WrongPinException e1) {
							System.out.println(e1.getMessage());
						}

						break;
					case 2:
						int accountNum;
						try {
							accountNum = account.getAccNum(pin);
							if (accountNum != -1) {
								System.out.println("Account Number : " + accountNum);
							}
						} catch (WrongPinException e1) {
							System.out.println(e1.getMessage());
						}

						break;
					case 3:
						System.out.println("Enter new name : ");
						String newName = userInput.nextLine();
						try {
							account.setName(newName, pin);
						} catch (WrongPinException e1) {
							System.out.println(e1.getMessage());
						}
						break;
					case 4:
						System.out.println("Enter the how much money you want to withdraw : ");
						int withdrawAmount = userInput.nextInt();
						userInput.nextLine();
						try {
							account.withdraw(withdrawAmount, pin);
						} catch (InvalidAmountException | InsufficientBalanceException e) {
							System.out.println(e.getMessage());
						}
						break;
					case 5:
						System.out.println("Enter how much you want to deposit : ");
						int depositAmount = userInput.nextInt();
						userInput.nextLine();
						try {
							account.deposit(depositAmount, pin);
						} catch (InvalidAmountException | InsufficientBalanceException e) {
							System.out.println(e.getMessage());
						}
						break;
					case 6:
						System.out.println("Your account type is : " + account.getTypeOfAcc());
						break;
					case 7:
						flag1 = false;
						break;
					default:
						System.out.println("Wrong choice");
						break;
					}
				}
			}

		} while (flag);
		userInput.close();

	}
}
