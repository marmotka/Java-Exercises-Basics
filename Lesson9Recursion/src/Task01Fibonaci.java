import java.util.Scanner;

public class Task01Fibonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int endFib = sc.nextInt();
		sc.close();
		System.out.println(fib(endFib));
		
	}
	
	static int fib (int num){
		if (num ==1 || num==2){
			return 1;
		}
		int nextNum = fib(num-1) + fib(num-2); 
		return nextNum;
	}
}
