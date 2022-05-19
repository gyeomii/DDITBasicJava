package chapter07Example.Bank2;

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
		balance += balance * interestRate * period;
	}
}
