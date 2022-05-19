package dditMidterm;

public class UserTest {
	public static void main(String[] args) {
		new UserTest().compare();
	}

	private void compare() {
		User a = new User("Kim", "Chopper");
		User b = new User("Kim", "Chopper");
		User c = a;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
	}

	public class User {
		private String firstName;
		private String lastName;

		public User(String firstName, String lastName) {
			this.firstName = new String(firstName);
			this.lastName = new String(lastName);
		}

		public boolean equals(User other) {
			return match(firstName, other.firstName) || match(lastName, other.lastName);
		}

		private boolean match(String part1, String part2) {
			return part1 == part2 && part1.equals(part2);
		}
	}
}
