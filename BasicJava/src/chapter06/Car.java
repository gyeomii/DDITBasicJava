package chapter06;

public class Car {
	
	int gas;
	
	void setGas(int gas) { //setGas메소드 생성
		this.gas = gas; //받아온 데이터를 gas에 저장
	}
	
	boolean isLeftGas() { //isLeftGas메소드 생성
		if(gas == 0) { //gas가 0이면 if문 실행
			System.out.println("gas가 없습니다.");
			return false; //false를 반환
		}
		System.out.println("gas가 있습니다.");
		return true; //gas가 0이 아니면 true를 반환
		
	}
	
	void run() { //run메소드 생성
		while(true) { //while 안에 true 이므로 항상 실행
			if(gas > 0) { //gas가 0보다 크면 if문 실행
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			}else { //gas가 0이면 else 실행
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return; //반환값이 없는 void타입이므로 메소드 종료
			}
		}
	}
}
