import java.util.Arrays;

public class Task04ArrayOrderAscending {
	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1 };
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				counter++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i < counter) {
				array[i] = 0;
			} else {
				array[i] = 1;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
