package suppliers;

import java.util.Random;

public class Product {
	Random r = new Random();
	private String name;
	private double price;

	protected Product(String name, int price) {
		if (name != null && !name.isEmpty())
			this.name = name;
		if (price >= 5 && price <= 15) {
			this.price = price;
		} else {
			this.price = r.nextInt(10) + 5;
		}
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		String info = String.format("product name: %s, product price: %.2f \n", this.name, this.price);
		return info;
	}

}
