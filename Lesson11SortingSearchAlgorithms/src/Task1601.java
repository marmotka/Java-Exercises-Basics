import java.util.Arrays;
import java.util.Scanner;

public class Task1601 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		binarySearch(arr, 0, arr.length - 1);

	}

	static void binarySearch(int[] arr, int left, int right) {
		Scanner sc = new Scanner(System.in);
		int mid = (left + right) / 2;
		int answ;
		
		do {
			System.out.println("Is your number: " + mid);
			answ = sc.nextInt();
		} while (!(answ >= 0 && answ <= 2));

		if (left >= right) {
			System.out.println("WTF");
			return;
		}
		if (answ == 1) {
			System.out.println("Yeah");
			return;
		}
		if (answ == 0) {
			binarySearch(arr, left, mid - 1);
		}
		if (answ == 2) {
			binarySearch(arr, mid + 1, right);
		}
		//System.out.println("Error");
		//reutrn -1;
	}
}
