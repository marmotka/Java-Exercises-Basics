import java.util.Scanner;

public class Task02ArrayHalfNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength;
		do {
			System.out.println("Please enter an even number - the length of the array:");
			arrayLength = sc.nextInt();
		} while (arrayLength < 2 || arrayLength % 2 == 1);
		System.out.println("Please enter " + arrayLength + " integer values:");
		int[] array = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			array[i] = sc.nextInt();
		}
		int[] newArray = new int[arrayLength];
		for (int i = 0; i < array.length / 2; i++) {
			newArray[i] = array[i];
		}
		for (int j = array.length - 1, i = array.length / 2; j >= array.length / 2; j--, i++) {
			newArray[i] = array[j];
		}
		for (int k = 0; k < newArray.length; k++) {
			System.out.print(newArray[k]);
		}
	}
}
