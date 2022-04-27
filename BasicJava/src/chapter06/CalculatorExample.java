package chapter06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		myCalc.execute(7, 10);
		
		myCalc.powerOff();
	}
}
