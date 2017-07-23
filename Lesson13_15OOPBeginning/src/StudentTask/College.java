package StudentTask;

public class College {
	public static void main(String[] args) {
		Student ivan = new Student("Ivan", "Chemistry", 20);
		Student pesho = new Student("Pesho", "Chemistry", 25);
		Student gosho = new Student("Gosho", "Chemistry", 22);
		Student tosho = new Student("Tosho", "Chemistry", 25);
		Student sasho = new Student("Sasho", "Chemistry", 24);
		Student posho = new Student("Posho", "Chemistry", 24);
		Student ivanka = new Student("Ivanka", "Biology", 21);
		Student sashka = new Student("Sashka", "Biology", 23);
		Student geshka = new Student("Geshka", "Chemistry", 23);

		StudentGroup biology = new StudentGroup("biology");
		StudentGroup chemistry = new StudentGroup("chemistry");
		biology.addStudent(sashka);
		biology.addStudent(ivanka);
		biology.addStudent(gosho);

		chemistry.addStudent(sashka);
		chemistry.addStudent(gosho);
		chemistry.addStudent(gosho);
		chemistry.addStudent(sasho);

		sashka.upYear();
		tosho.upYear();
		double moneyTosho = tosho.recieveScholarShip(4, 25);
		System.out.println(moneyTosho);
		tosho.upYear();
		tosho.upYear();
		chemistry.addStudent(tosho);
		chemistry.addStudent(ivan);
		chemistry.addStudent(pesho);
		chemistry.addStudent(posho);
		chemistry.addStudent(geshka);

		tosho.toString();
		// System.out.println("---------------------");
		biology.toString();
		chemistry.toString();
		String theBest=chemistry.theBestStudent();
		System.out.println(theBest);
	}
}
