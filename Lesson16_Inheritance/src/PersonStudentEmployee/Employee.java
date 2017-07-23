package PersonStudentEmployee;

public class Employee extends Person {

	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (daySalary > 0) {
			this.daySalary = daySalary;
		}
	}
	
	double calculateOvertime (double hours){
		if (this.getAge()<18){
			return 0;
		} else {
			return hours*this.daySalary*1.5;
		}
	}
	
	public String toString() {
		return super.toString() + String.format(" | Salary for a day: %.2f", daySalary);
	}


	static void askForEmployeeInfo() {		
	//	super.askForInfo();
		System.out.println("Enter on separate lines name, age, gender - f/m, salary for a day ");
	}
}
