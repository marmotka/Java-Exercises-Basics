import java.util.Scanner;

public class Task05PalindromPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int numReversed = numBackwards(num,0);
		System.out.println(numReversed);
		System.out.println(num==numReversed ? "is Palindrom" : "is NOT Palindrom");
	}

	static int numBackwards(int n, int reverse) {
		int remain = 0;	
		int numNew = n / 10;
		remain = n % 10;
		reverse = reverse * 10 + remain;
		if (numNew== 0) {			
			return reverse;
		} else {
			return numBackwards(numNew, reverse);
		}
	}

}