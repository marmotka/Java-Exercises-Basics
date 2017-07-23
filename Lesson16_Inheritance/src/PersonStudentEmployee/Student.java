package PersonStudentEmployee;

public class Student extends Person {

	private double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" | score: %.2f", score);
	}

	void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		}
	}

	static void askForStudentInfo() {
	//	super.askForInfo();
		System.out.println("Enter on separate lines name, age, gender - f/m, score ");

	}
}
