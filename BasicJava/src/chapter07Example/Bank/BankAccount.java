package chapter07Example.Bank;

public class BankAccount {
	// 필드
	private int balance;

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance; // balance 초기화
	}

	public int getBalance() { // 현재 계좌의 잔액
		return balance;
	}

	public void deposit(int amount) { // 입금 메소드
		balance += amount; // 잔고에 입금액을 입금
	}

	public boolean withdraw(int amount) { // 출금 메소드
		if (balance >= amount) {
			balance -= amount; // 잔고에서 출금액 만큼 출금
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) { // 현재계좌에서 amount만큼 다른계좌로 송금하는 메소드
		if (withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
}
