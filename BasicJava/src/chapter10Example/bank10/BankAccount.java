package chapter10Example.bank10;

import java.text.DecimalFormat;

public abstract class BankAccount {
	// 필드
	protected int balance;

	// 숫자에 세자리 마다 ','를 찍어주기 위한 함수, 출력은 String 이다.
	DecimalFormat formatter = new DecimalFormat("###,###");

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance; // balance 초기화
	}

	// 메소드
	public abstract String getAccountType();

	public int getBalance() { // 현재 계좌의 잔액
		return balance;
	}

	public void deposit(int amount) { // 입금 메소드
		balance += amount; // 잔고에 입금액을 입금
	}

	public boolean withdraw(int amount) { // 출금 메소드
		if (balance >= amount && amount >= 0) {
			balance -= amount; // 잔고에서 출금액 만큼 출금
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) { // 현재계좌에서 amount만큼 다른계좌로 송금하는 메소드
		if (amount < 0 || amount > balance) {
			throw new IllegalArgumentException();
		} /*else if (otherAccount == null) {
		throw new NullPointerException();
		}*/ //어차피 nullpointexception오류는 catch에서 잡기때문에 생략 가능할지도
		if (balance >= amount) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}

	public String toString() { // 잔액 출력
		return String.format("%s", formatter.format(balance));
	}
}
