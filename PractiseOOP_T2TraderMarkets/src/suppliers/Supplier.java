package suppliers;

import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Supplier extends Person {

	private LocalTime workTime;
	protected ArrayList<Product> productsForSale = new ArrayList<>();
	// protected ArrayList<Product> productsSaled;
	protected double discount;

	public Supplier(String name, String address, LocalTime workTime) {
		super(name, address);
		this.workTime = workTime;
		genRndProducts();
	}

	public double showOrderInfoAndPrice(ArrayList<Product> productsOrdered) {
		double sum = 0;
		for (Product product : productsOrdered) {
			System.out.println(product.toString());
			sum += product.getPrice();
		}
		sum *= discount;
		System.out.println("-------------END OF PRODUCTS LIST-------------\n");
		System.out.printf("Order price after discount (if available): %.2f \n", sum);
		return sum;
	}

	public void finilizeOrder(ArrayList<Product> list, double orderPrice) {
		productsForSale.removeAll(list);
		this.money += orderPrice;
		System.out.println("***END OF ORDER*** \n");
	}

	private void genRndProducts() {
		for (int i = 0; i < 1000; i++) {
			productsForSale.add(new Product("Product" + i, r.nextInt(50) + 10));
		}
	}

	public ArrayList<Product> showProducts() {
		return new ArrayList<Product>(productsForSale);
	}

}
