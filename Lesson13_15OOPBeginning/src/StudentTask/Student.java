package StudentTask;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private int money;

	private Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		setName(name);
		setSubject(subject);
		setAge(age);
	}

	@Override
	public java.lang.String toString() {
		System.out.println("--------------------------");
		System.out.printf(" Student: %s / age: %d / year in College: %d Graduated: %b %n Subject: %s / Grades: %.2f / Cash: %d%n", this.name, this.age, this.yearInCollege, this.isDegree, this.subject, this.grade, this.money);
	//	System.out.println("--------------------------");
		return super.toString();
	}
	
	
	void upYear() {
		setYearInCollege(++yearInCollege);
	}

	double recieveScholarShip(double min, double amount) {
		if (this.grade >= min && this.getAge() < 30) {
			this.money += amount;
			System.out.printf("%s earned %d money for scholarship%n", this.name, this.money);
		} else {
			System.out.println("Didn't get scholarship");
			System.out.printf("%s has %d money", this.name, this.money);
		}
		return this.money;
	}
	


	String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && name.length() > 3 && name.matches("[a-zA-Z ]+")) {
			this.name = name;
		}
	}

	String getSubject() {
		return subject;
	}

	private void setSubject(String subject) {
		if (subject != null && subject.length() > 0 && subject.matches("[a-zA-Z ]+")) {
			this.subject = subject;
		}
	}

	int getYearInCollege() {
		return yearInCollege;
	}

	private void setYearInCollege(int yearInCollege) {
		if (yearInCollege >= 4) {
			isDegree = true;
			System.out.printf("%s has finished his education%n", this.name );
		} else if (yearInCollege > 0 && yearInCollege < 4) {
			this.yearInCollege = yearInCollege;
		} else {
			System.out.println("Ivalid year in College");
		}
	}

	int getAge() {
		return age;
	}

	private void setAge(int age) {
		if (age >= 18 && age <= 90) {
			this.age = age;
		}
	}

	int getMoney() {
		return money;
	}

//	private void setMoney(int money) {
//		this.money = money;
//	}

	double getGrade() {
		return grade;
	}

	boolean isDegree() {
		return isDegree;
	}

}
