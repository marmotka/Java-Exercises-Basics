package PersonStudentEmployee;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[10];
		// String txt = "";
		int added = 0;

		// do {
		// if (added == 10) {
		// break;
		// }
		// System.out.println("Enter type of personal info:
		// person|student|employee");
		// txt = sc.nextLine();
		//
		// if (txt.equals("person")) {
		// Person.askForInfo();
		// people[added++] = new Person(sc.nextLine(),
		// Integer.parseInt(sc.nextLine()), Person.setMale(sc.nextLine()));
		// } else if (txt.equals("student")){
		// Student.askForStudentInfo();
		// people[added++] = new Student(sc.nextLine(),
		// Integer.parseInt(sc.nextLine()), Person.setMale(sc.nextLine()),
		// Double.parseDouble(sc.nextLine()));
		// } else if (txt.equals("employee")){
		// Employee.askForEmployeeInfo();
		// people[added++] = new Employee(sc.nextLine(),
		// Integer.parseInt(sc.nextLine()), Person.setMale(sc.nextLine()),
		// Double.parseDouble(sc.nextLine()));
		//
		// } else {
		// continue;
		// }
		//
		// } while (!txt.equals("end"));

		Person me = new Person("Az-yt", 5, false);
		Person you = new Person("Ti-yt", 3, false);
		Student pesho = new Student("Pesho", 20, true, 4.5);
		Student gosho = new Student("Gosho", 25, true, 5);
		Employee slave1 = new Employee("John", 30, true, 10);
		Employee slave2 = new Employee("Anna", 35, false, 5);

		people[added++] = me;
		people[added++] = you;
		people[added++] = pesho;
		people[added++] = gosho;
		people[added++] = slave1;
		people[added++] = slave2;

		for (int i = 0; i < added; i++) {
			System.out.println(people[i].toString());
		}

		for (int i = 0; i < added; i++) {
			if (people[i] instanceof Employee) {
				// (Employee) people[i].
				System.out.printf("%s has earned %.2f lv for 2 hours overtime %n", people[i].getName(),
						((Employee) people[i]).calculateOvertime(2));
			}
		}

		// me.askForInfo();
		// pesho.askForStudentInfo();

		// System.out.println(pesho.toString());
		// System.out.println(me.toString());
		sc.close();
	}
}
