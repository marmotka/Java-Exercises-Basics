import java.util.Scanner;

public class Task10_0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the volume of the tank:");
		int volume = sc.nextInt();
		int countBothBucket = volume / 5;
		int extraVolume = volume % 5;
		int extraBucketCount;
		int extraBucketVolume;
		if (extraVolume % 2 == 0) {
			extraBucketCount = extraVolume / 2;
			extraBucketVolume = 2;
		} else {
			if (extraVolume == 1) {
				countBothBucket--;
				extraBucketCount = 2;
				extraBucketVolume = 3;
			} else {
				extraBucketCount = 1;
				extraBucketVolume = 3;
			}
		}
		System.out.printf("%d times bucket of 2 liters%n", countBothBucket);
		System.out.printf("%d times bucket of 3 liters%n", countBothBucket);
		if (extraBucketCount != 0) {
			System.out.printf(" extra %d bucket of %d liters", extraBucketCount, extraBucketVolume);
		}
	}
}
