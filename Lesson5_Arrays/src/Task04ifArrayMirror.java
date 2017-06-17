import java.util.Scanner;

public class Task04ifArrayMirror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lengthArray;
		do {
			System.out.println("Enter the legth if the array:");
			lengthArray = sc.nextInt();
		} while (lengthArray < 1);
		
		int[] array = new int[lengthArray];
		System.out.println("Enter the values:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		boolean isMirror = true;
		int j = array.length-1;
		for (int i = 0; i < array.length / 2; i++) {			
			if (array[i] != array[j]) {
				isMirror = false;
			}
			j--;
		}
		if (isMirror) {
			System.out.println("The array is mirror array");
		} else {
			System.out.println("The array is not mirror array");
		}
	}
}
