import java.util.Scanner;

public class Test1Sea5v1Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countHeads =0;
		int countTries =0;
		do {
			String input = sc.nextLine().toLowerCase();
			if (!isValid(input)){
				System.out.println("Invaid input");
				continue;
			}
			countTries++;
			if (input.equals("heads")){
				countHeads ++;
			} else{
				countHeads =0;
			}
			
		} while (countHeads<5);
		System.out.println(countTries);
	}
	static boolean isValid (String text){
		if (text.equals("heads")|| text.equals("tails")){
			return true;
		} else {
			return false;
		}
	}
}
