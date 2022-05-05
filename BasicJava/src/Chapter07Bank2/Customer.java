package Chapter07Bank2;

import java.text.DecimalFormat;

public class Customer {
	// 필드
	private String firstName;
	private String lastName;
	private BankAccount[] accounts; // 사용자 정의 타입인 클래스형 변수
	private int numberOfAccounts;
	// 숫자에 세자리 마다 ','를 찍어주기 위한 함수, 출력은 String 이다.
	DecimalFormat formatter = new DecimalFormat("###,###");

	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName; // 고객 이름 저장
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	// 메소드

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) { // BankAccount 타입 메소드 생성
		return accounts[index];
	}

	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts] = account; // customers배열에 고객정보 저장
		numberOfAccounts++;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public String toString() { // 출력 메소드
		return String.format("이름: %s %s, 잔고: %f", firstName, lastName, accounts);
	}

}
