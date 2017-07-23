
public class Testtt {
	public static void main(String[] args) {
//		int x = 5;
//		x = x++;
//		System.out.println(x);
//		// изход 5;
		
	StringBuilder builder = new StringBuilder("ovcata");
	System.out.println(builder.length());
	builder.insert(6, " Doli");
	System.out.println(builder);
//	builder.insert(builder.length(), " Doli");
	builder.insert(6, " na ime");
	System.out.println(builder);
	
	
	builder.replace(7, 13, "koqto se kazvashe");
	System.out.println(builder);
		
	}
}
