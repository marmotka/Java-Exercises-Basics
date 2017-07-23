package StudentTask;

public class StudentGroup {

	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	private StudentGroup() {
		freePlaces = 5;
		students = new Student[5];
	}

	StudentGroup(String subject) {
		this();
		setSubject(subject);
	}

	private void setSubject(String subject) {
		if (subject != null && subject.length() > 0 && subject.matches("[a-zA-Z ]+")) {
			this.groupSubject = subject;
		}
	}

	void addStudent(Student s) {
		if (s.isDegree()) {
			System.out.printf("%s already graduaded and cannot be added in new groups %n", s.getName());
		} else if (freePlaces < 1) {
			System.out.printf("No available place in group %s %n",this.groupSubject );
		} else if (this.hasMember(s)) {
			System.out.printf("%s already added to group %s %n", s.getName(), this.groupSubject);
		} else if (!s.getSubject().toLowerCase().equals(this.groupSubject)) {
			System.out.printf("%s studies %s and can NOT be added in group %s%n", s.getName(), s.getSubject(),
					this.groupSubject);
		} else {
			students[students.length - freePlaces--] = s;
			System.out.printf("%s added in group %s%n", s.getName(), this.groupSubject);
		}
	}

	String getGroupSubject() {
		return groupSubject;
	}

	private boolean hasMember(Student s) {
		for (int i = 0; i < students.length - freePlaces; i++) {
			if (students[i] == s) {
				return true;
			}
		}
		return false;
	}

	void emptyGroup() {
		this.students = null;
		this.freePlaces = 5;
	}

	String theBestStudent() {
		double maxGrade = students[0].getGrade();
		int idxOfBest = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGrade() > maxGrade) {
				maxGrade = students[i].getGrade();
				idxOfBest = i;
			}
		}
		System.out.printf("Best student in group %s is %s with grade %.2f ",this.groupSubject, students[idxOfBest].getName(), students[idxOfBest].getGrade());
		return students[idxOfBest].getName();
	}

	@Override
	public String toString() {
		System.out.println();
		System.out.printf("--- --- GROUP %s --- ---", this.groupSubject.toUpperCase());
		for (int i = 0; i < (students.length - freePlaces); i++) {
			students[i].toString();
		}

		return super.toString();
	}

}
