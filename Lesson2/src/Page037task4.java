import java.util.Scanner;

public class Page037task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		boolean triangle = ((a<b+c) && (b<a+c)&& (c<a+b));
		System.out.println(triangle);
	}

}
