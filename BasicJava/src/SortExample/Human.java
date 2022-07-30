package SortExample;

public class Human implements Comparable<Human> {
	private String name;
	private int age;
	public Human() {
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Human o) {
		if (age > o.age) {
			return 1;
		} else if (age < o.age) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
