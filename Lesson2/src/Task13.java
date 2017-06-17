import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the temperature in Celsius:");
		int temp = sc.nextInt();
		if (temp >= -100 && temp < -20) {
			System.out.println("Freezing");			
		} else if (temp >= -20 && temp < 0){
			System.out.println("Cold");
		} else if (temp >= 0 && temp < 15){
			System.out.println("Cool");
		} else if (temp >=15 && temp < 25){
			System.out.println("Warm");
		} else if (temp >=25 && temp <= 100){
			System.out.println("Hot");
		} else {			
			System.out.println("Invalid temperature!");
		}
	}

}
