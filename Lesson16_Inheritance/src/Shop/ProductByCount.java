package Shop;

public class ProductByCount extends Product {
	
	public ProductByCount(String name, double price, int quantity) {	
		super(name, price, quantity);
		super.setUnit("pieces");
	}
}
