package chapter07Example;

public class Bank {
	// 필드
	private Customer[] customers;
	private int numberOfCustomers;

	// 생성자
	public Bank() {
		this.customers = new Customer[10];
	}
	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
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
