package chaptor06Example;

public class Plane {
	//필드
	String manufacture;
	String model;
	int maxNumberOfPassengers;
	static int numberOfPlanes;
	//생성자
	public Plane() {
		this(null, null, 0);
	}
	public Plane(String manufacture, String model, int maxnumberOfPassengers) {
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxnumberOfPassengers;
		numberOfPlanes++;//생성자를 호출할 때 마다 +1
	}
	//메소드
	public String getManufacture() {
		return manufacture;
	}
	
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if( maxNumberOfPassengers < 0) {
			this.maxNumberOfPassengers = 0;
		}else {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	
	static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
	public String toString() {
		return String.format("%d", numberOfPlanes);
	}
}
