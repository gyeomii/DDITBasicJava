package Chapter07Bank2;

import chapter07Example.BankAccount;

public class SavingsAccount extends BankAccount {
	// 필드
	private double interestRate; // 이자율

	// 생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance); // 초기화
		this.interestRate = interestRate;
	}

	// 메소드
	public void updateBalance(int period) {// 이자를 계산하여 잔액에 추가
		this.balance += balance * interestRate * period;
	}
}
