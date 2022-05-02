package chaptor06Example;

public class PlaneTest {

	public static void main(String[] args) {
		Plane plane1 = new Plane("보잉", "보잉747", 450);
		System.out.println("제조사: " + plane1.getManufacture());
		System.out.println("모델명: " + plane1.getModel());
		System.out.println("최대 승객수 :" + plane1.getMaxNumberOfPassengers());
		System.out.println();

		Plane plane2 = new Plane("보잉", "보잉777", 500);
		System.out.println("제조사: " + plane2.getManufacture());
		System.out.println("모델명: " + plane2.getModel());
		System.out.println("최대 승객수 :" + plane2.getMaxNumberOfPassengers());
		System.out.println();

		Plane plane3 = new Plane();
		plane3.setManufacture("룩히트 마틴");
		plane3.setModel("f-22");
		plane3.setMaxNumberOfPassengers(-10);

		System.out.println("제조사: " + plane3.getManufacture());
		System.out.println("모델명: " + plane3.getModel());
		System.out.println("최대 승객수 :" + plane3.getMaxNumberOfPassengers());
		System.out.println();

		System.out.println("생산된 비행기의 수: " + Plane.getNumberOfPlanes());

	}

}
