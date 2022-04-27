package chapter06;

public class CarExample {
	public static void main(String[] args) {
		Car mycar = new Car(); //Car()객체 인스턴스화
		
		mycar.setGas(5); //setGas메소드 호출
		
		boolean gasState = mycar.isLeftGas(); //isLeftGas메소드 호출
		if(gasState) { //gasState가 true면 if문 실행
			System.out.println("출발합니다.");
			mycar.run(); //run()메소드 호출
		}
		
		if(mycar.isLeftGas()) { //isLeftGas()에서 리턴된 값이 true면 if문 실행
								//false면 else로 넘어감
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
