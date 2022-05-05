package Chapter07Bank2;

public class CheckingAccount extends BankAccount {
	// 필드
	private SavingsAccount protectedBy;// Savings

	// 생성자
	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	// 메소드
	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
		    protectedBy.balance -= (amount - balance);
		    balance = 0;
			return true;
		}else if(balance > amount){
			balance -= amount;
			return true;
		}else {
			return false;
		}
		
	}
}
