import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task03ArraysToOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		int[] arr1 = new int[length];
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("Enter the %d value of the array", (i + 1));
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = { 6, 4, 7, 3, 6, 4, 6 };
		int[] newArray = concatArrays(arr1, arr2);
		System.out.println(Arrays.toString(newArray));
	}

	static int[] concatArrays(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < newArr.length; i++) {
			if (i < arr1.length) {
				newArr[i] = arr1[i];
			} else {
				newArr[i] = arr2[i - arr1.length];
			}
		}
		return newArr;
	}
}
