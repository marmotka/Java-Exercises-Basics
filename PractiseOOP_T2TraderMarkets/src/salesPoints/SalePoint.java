package salesPoints;

import java.time.LocalTime;
import java.util.ArrayList;

import suppliers.Person;
import suppliers.Product;

public abstract class SalePoint extends Person {

	private LocalTime workTime;
	protected int area;
	protected double taxes;
	protected ArrayList<Product> productsForSale = new ArrayList<>();
	protected ArrayList<Product> productsSaled = new ArrayList<>();

	protected SalePoint(String name, String address, LocalTime workTime) {
		super(name, address);
		this.workTime = workTime;
	}

	public void calcDaySales() {
		if (!productsForSale.isEmpty()) {
			int rndCountSaledProducts = r.nextInt(productsForSale.size());
			int rndNumFromList = r.nextInt(productsForSale.size());
			double sum = 0;
			for (int i = 0; i < rndCountSaledProducts; i++) {
				Product product = productsForSale.get(rndNumFromList);
				productsSaled.add(product);
				sum += product.getPrice() * 1.3;
			}
			setMoney(sum);
			// return sum;
		} else {
			System.out.println("No products in store \n");
		}
	}

	protected void setMoney(double money) {
		this.money += money;
	}

	public void showMoney() {
		System.out.printf("Point of sale : %s  has %.2f money at the moment \n", this.getName(), this.money);
		// return this.money;
	}

	public double giveMoneyToBoss() {
		double sum = this.money;
		setMoney(this.money - sum);
		return sum;
	}

	public ArrayList<Product> getProductsForSale() {
		return productsForSale;
	}

	public int getNumberProductsSaled() {
		return productsSaled.size();
	}

	public double getTaxes() {
		return taxes;
	}
}
