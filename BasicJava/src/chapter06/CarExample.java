package chapter06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //Car()객체 인스턴스화
		myCar.keyTurnOn();
		myCar.setGas(15); //setGas메소드 호출
		
		boolean gasState = myCar.isLeftGas(); //gasState에 isLeftGas에서 호출된 값 저장
		if(gasState) { //gasState가 true면 if문 실행
			System.out.println("출발합니다.");
			myCar.run(); //run()메소드 호출
		}
		
		if(myCar.isLeftGas()) { //isLeftGas()에서 리턴된 값이 true면 if문 실행
								//false면 else로 넘어감
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
