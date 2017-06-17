import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A:");
		double numA = sc.nextDouble();
		System.out.println("Enter number B:");
		double numB = sc.nextDouble();
		if (numA > numB) {
			System.out.println(numA);
			System.out.println(numB);
		} else if (numB > numA){
			System.out.println(numB);
			System.out.println(numA);
		} else {
			System.out.println(numA + "=" + numB);
		}
	}
}
