package chapter09;

public class AnonymousVehicleExample {
	public static void main(String[] args) {
		AnonymousVehicle anony = new AnonymousVehicle();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
}
