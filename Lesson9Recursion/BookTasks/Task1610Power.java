
public class Task1610Power {
	public static void main(String[] args) {
		int x = 9;
		int y=2;
		System.out.println(multiply(x,y));
		System.out.println(powerTwo(x,y));
	}
	static int powerTwo(int x, int y){
		if (y==1){
			return x;
		}
		return multiply(powerTwo (x,y-1) , x);
	}
	
	static int multiply (int x, int y){
		if (y==1){
			return x;
		}
		return (multiply (x, y-1) + x);
	}
}
