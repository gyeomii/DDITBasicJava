package chapter07Example;

public class Customer {
	// 필드
	private String firstName;
	private String lastName;
	private BankAccount account;

	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return String.format("이름: %s %s, 잔고: %d", firstName, lastName, account.getBalance());
	}

}
