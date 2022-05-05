package chapter07Example;

public class BankAccount {
	// 필드
	private int balance;

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() { // 현재 계좌의 잔액
		return balance;
	}

	public void deposit(int amount) { // 입금 메소드
		balance += amount;
	}

	public boolean withdraw(int amount) { // 출금 메소드
		if (balance - amount < 0) {
			return false;
		} else {
			balance -= amount;
			return true;
		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) { // 현재계좌에서 amount만큼 다른계좌로 송금하는 메소드
		if (balance - amount < 0) {
			return false;
		} else {
			this.balance -= amount;
			otherAccount.balance += amount;
			return true;
		}
	}
}
