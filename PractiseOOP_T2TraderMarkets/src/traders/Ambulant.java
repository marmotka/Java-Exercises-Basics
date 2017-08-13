package traders;

import salesPoints.SalePoint;
import suppliers.Retailer;
import suppliers.Supplier;

public class Ambulant extends Trader {

	public Ambulant(String name, String address, double money) {
		super(name, address, money);
		// protected ArrayList<SalePoint> salePoints;
		// protected ArrayList<Supplier> suppliers;

	}

	@Override
	public void addPointOfSale(SalePoint salePoint) {
		this.salePoints.add(salePoint);
	}

	@Override
	public void addSupplier(Supplier supplier) {
		if (this.suppliers.size() <= 1 && supplier instanceof Retailer) {
			this.suppliers.add(supplier);
		}

	}

}
