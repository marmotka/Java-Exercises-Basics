import java.util.Scanner;

public class Task03ArrayInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number:");
		int num = sc.nextInt();
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			if (i < 2) {
				array[i] = num;
			} else {
				array[i] = array[i - 1] + array[i - 2];
			}
		}
		for (int i=0; i < 10; i++){
			System.out.print(array[i] + " ");
		}
	}
}
