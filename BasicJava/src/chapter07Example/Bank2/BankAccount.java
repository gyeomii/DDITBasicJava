package chapter07Example.Bank2;

import java.text.DecimalFormat;

public class BankAccount {
	// 필드
	protected int balance;

	// 숫자에 세자리 마다 ','를 찍어주기 위한 함수, 출력은 String 이다.
	DecimalFormat formatter = new DecimalFormat("###,###");

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
		if (balance < amount) { // 잔고 < 출금액 일 때
			return false;
		} else { // 잔고 > 출금액일 때
			balance -= amount; // 잔고에서 출금액 만큼 출금
			return true;
		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) { // 현재계좌에서 amount만큼 다른계좌로 송금하는 메소드
		if (balance < amount) { // 잔고 < 출금액일 때
			return false;
		} else {
			balance -= amount; // 본인 잔고에서 출금액 만큼 출금
			otherAccount.balance += amount; // 타인 잔고에 출금액을 입금
			return true;
		}
	}

	public String toString() { // 잔액 출력
		return String.format("%s", formatter.format(balance));
	}
}
