import java.util.Scanner;

public class Test1Sea7Task3 {
	public static void main(String[] args) {
		System.out.println("enter length: ");
		Scanner sc = new Scanner(System.in);
	//	String tst = sc.nextLine().toLowerCase();
		int length = sc.nextInt();
		int [] arr = new int [length];
		for (int i =0; i < arr.length; i++){
			System.out.printf("enter value of %d cell", i+1);
			arr[i]=sc.nextInt();
		}
		System.out.println(hasOnlyNeg(arr,0, arr.length-1));
	}
	
	static boolean hasOnlyNeg (int[] array, int start, int end){
		if (array[start]>=0){
			return false;
		}if (start == end){
			return true;
		} else {
			return hasOnlyNeg(array, ++start, end);
		}
	}
}
