package Shop;

public class ProductByKilos extends Product{

	public ProductByKilos(String name, double price, double quantity) {
		super(name, price, quantity);
		super.setUnit("kilos");
	}
}
