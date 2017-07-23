package PersonStudentEmployee;

public class Person {

	private String name;
	private int age;
	private boolean isMale;

	protected Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return String.format("name: %s | age: %d | gender: %s ", this.name, this.age, isMale ? "male" : "female");

	}

	static void askForInfo() {
		System.out.print("Enter on separate lines name, age, gender - f/m ");
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		if (name.length() > 0 && name.matches("^[\\p{L} .'-]+$")) {
			this.name = name;
		} else {
			System.out.println("Invalid name");
		}
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		if (age >= 0 && age < 120) {
			this.age = age;
		}
	}
	
	static boolean setMale(String gender) {
		if (gender.equals("m")) {
			return true;
		} else if (gender.equals("f")) {
			return false;
		} else {
			System.out.println("Invalid gender, enter new value");
			return false;
		}

	}

//	protected void setMale(String gender) {
//		if (gender.equals("m")) {
//			this.isMale = true;
//		} else if (gender.equals("f")) {
//			this.isMale = false;
//		} else {
//			System.out.println("Invalid gender, enter new value");
//		}
//
//	}

	protected boolean isMale() {
		return isMale;
	}

}
