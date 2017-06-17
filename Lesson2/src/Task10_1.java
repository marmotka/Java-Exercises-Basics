import java.util.Scanner;

public class Task10_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the volume of the tank:");
		int volume = sc.nextInt();
		int countBothBucket = volume / 5;
		int extraVolume = volume % 5;

		if (extraVolume % 2 == 0) {
			System.out.printf("%d times bucket of 2 liters%n", countBothBucket);
			System.out.printf("%d times bucket of 3 liters%n", countBothBucket);
			if (extraVolume != 0) {
				int extraBucketCount = extraVolume / 2;
				System.out.printf(" extra %d bucket of 2 liters", extraBucketCount);
			} else {
				System.out.println("No extra buckets");
			}
		} else {
			if (extraVolume == 1) {
				countBothBucket--;
				System.out.printf("%d times bucket of 2 liters%n", countBothBucket);
				System.out.printf("%d times bucket of 3 liters%n", countBothBucket);
				System.out.printf(" extra 2 buckets of 3 liters");
			} else {
				System.out.printf("%d times bucket of 2 liters%n", countBothBucket);
				System.out.printf("%d times bucket of 3 liters%n", countBothBucket);
				System.out.printf(" extra 1 bucket of 3 liters");
			}
		}
	}

}
