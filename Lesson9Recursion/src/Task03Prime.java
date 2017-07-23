import java.util.Scanner;

public class Task03Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int num = sc.nextInt();
		sc.close();
		if (num >2) {
			System.out.println(testPrime(num, 2));
		} else if (num==2){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	static boolean testPrime(int num, int i) {
	
		if (i == num/2 ) {
			return true;
		} else if (num % i == 0) {
			return false;			
		} else {
			return testPrime(num, ++i);
		}
	}

}
