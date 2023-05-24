package exception_practice.practice07;

public class Account {

	private long balance;
	
	

	public Account() {
		super();
	}

	public Account(long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고 부족: " + (money-balance) + " 모자람");
		}
		balance -= money;
	}
	
}
