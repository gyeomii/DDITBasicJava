package chapter07Example.Bank;


public class Customer {
	// 필드
	private String firstName;
	private String lastName;
	private BankAccount account; // 사용자 정의 타입인 클래스형 변수

	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName; // 고객 이름 저장
		this.lastName = lastName;
	}

	// 메소드
	public BankAccount getAccount() { // BankAccount 타입 메소드 생성
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account; // account 초기화
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() { // 출력 메소드
		return String.format("이름: %s %s, 잔고: %,d", firstName, lastName, account.getBalance());
	}

}