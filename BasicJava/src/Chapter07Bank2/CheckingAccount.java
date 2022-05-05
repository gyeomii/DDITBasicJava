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
		if (balance < amount) { // 출금액 > checking계좌의 잔액일 때 
			protectedBy.balance -= (amount - balance); // 저축계좌에서 출금액과 checking계좌 잔액의 차액만큼 출금
			balance = 0; // checking계좌 잔액 전액 인출
			return true;
		} else if (balance > amount) { // 출금액 < checking계좌의 잔액일 때
			balance -= amount; // 잔액만큼 출금
			return true;
		} else {
			System.out.println("인출할 수 없습니다.");
			return false;
		}

	}
}
