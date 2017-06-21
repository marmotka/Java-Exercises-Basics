import java.util.Scanner;

public class Task02ZigZagArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the values: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// int[] array = {1,3,2,6,4,9,7,8,5,9};
		// int[] array = {3,2,6,4,9,7,8,5,9};
		// int[] array = {1,3,3,2,6,4,9,7,8,5,9};
		boolean isZigZag = true;
		for (int i = 1; i < array.length - 1; i++) {
			boolean upZigZag = array[i] > array[i - 1] && array[i] > array[i + 1];
			boolean downZigZag = array[i] < array[i - 1] && array[i] < array[i + 1];
			if (!(upZigZag || downZigZag)) {
				isZigZag = false;
			}
		}
		System.out.println(isZigZag ? "is ZigZag" : "is NOT ZigZag");
	}
}
