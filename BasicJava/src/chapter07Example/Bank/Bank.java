package chapter07Example.Bank;

public class Bank {
	// 필드
	private Customer[] customers;
	private int numberOfCustomers;

	// 생성자
	public Bank() {
		customers = new Customer[10]; // customers 배열 초기화
	}

	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer; // customers배열에 고객정보 저장
		numberOfCustomers++; // 고객 수 증가
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}

}