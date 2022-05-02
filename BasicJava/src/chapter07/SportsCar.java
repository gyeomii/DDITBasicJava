package chapter07;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/*final로 선언된 메소드기 때문에 재정의(오버라이드) 할 수 없음
	  @Override
	  public void stop(){
	  System.out.println("스포츠카를 멈춤");
	  speed = 0;
	  }
	 */
}
