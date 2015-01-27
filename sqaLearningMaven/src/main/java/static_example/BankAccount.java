package static_example;

public class BankAccount {
	public String actHolderName;
	public int initialAmount;
	static int accountNumber;
	
	
	public BankAccount(String actHolderName,int initialAmount) {
		this.actHolderName = actHolderName;
		this.initialAmount = initialAmount;
		accountNumber++;
	}


	public String getActHolderName() {
		return actHolderName;
	}


	public void setActHolderName(String actHolderName) {
		this.actHolderName = actHolderName;
	}


	public int getInitialAmount() {
		return initialAmount;
	}


	public void setInitialAmount(int initialAmount) {
		this.initialAmount = initialAmount;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
