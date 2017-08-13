package traders;

import java.util.ArrayList;

import salesPoints.SalePoint;
import suppliers.Person;
import suppliers.Product;
import suppliers.Supplier;

public abstract class Trader extends Person {

	protected ArrayList<SalePoint> salePoints = new ArrayList<>();
	protected ArrayList<Supplier> suppliers = new ArrayList<>();
	protected double payedTaxes;

	public Trader(String name, String address, double money) {
		super(name, address);
		if (money > 0) {
			this.money = money;
		}
	}

	public void makeOrder(Supplier supplier, SalePoint salePoint) {
		if (this.money != 0) {
			ArrayList<Product> list = genRandomOrder(supplier);
			double orderPrice = supplier.showOrderInfoAndPrice(list);
			if (hasMoneyToPay(orderPrice)) {
				this.money -= orderPrice;
				salePoint.getProductsForSale().addAll(list);
				supplier.finilizeOrder(list, orderPrice);
			} else {
				System.out.println("Don't have enough money for this order. I'll make another order. \n");
				// makeOrder(supplier, salePoint);
			}

		} else {
			System.out.println("BANCRUPT");
		}
	}

	public void takeCashOfSalePoint(SalePoint currentsalePoint) {

		this.money += currentsalePoint.giveMoneyToBoss();
	}

	public void payTaxes(SalePoint currentsalePoint) {
		double currentTax = currentsalePoint.getTaxes();
		this.money -= currentTax;
		payedTaxes += currentTax;
		System.out.println("Payed taxes " + currentTax + "\n");
	}

	protected boolean hasMoneyToPay(double priceOrder) {
		if (priceOrder <= this.money / 2) {
			return true;
		}
		return false;
	}

	private ArrayList<Product> genRandomOrder(Supplier supplier) {
		ArrayList<Product> list = new ArrayList<Product>();
		int rndNumProductsToOrder = r.nextInt(10) + 5;
		for (int i = 0; i < rndNumProductsToOrder; i++) {
			list.add(supplier.showProducts().get(r.nextInt(supplier.showProducts().size())));
		}
		return list;
	}

	public ArrayList<SalePoint> getSalePoints() {
		return salePoints;
	}

	public ArrayList<Supplier> getSuppliers() {
		return suppliers;
	}

	public double getPayedTaxes() {
		return payedTaxes;
	}

	public abstract void addSupplier(Supplier supplier);

	public abstract void addPointOfSale(SalePoint salePoint);
}
