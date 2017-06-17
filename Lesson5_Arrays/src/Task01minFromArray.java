import java.util.Scanner;

public class Task01minFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		int min = Integer.MAX_VALUE;
		boolean isNumberDiv3 = false;
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] % 3 == 0 && array[i] < min) {
				min = array[i];
				isNumberDiv3 = true;
			}
		}
		if (isNumberDiv3) {
			System.out.println(min);
		} else {
			System.out.println("There isn't any number in the array dividable by three");
		}
	}
}
