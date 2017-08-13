package traders;

import salesPoints.MallPoint;
import salesPoints.SalePoint;
import salesPoints.StreetPoint;
import suppliers.Supplier;

public class Chain extends Trader {

	public Chain(String name, String address, double money) {
		super(name, address, money);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPointOfSale(SalePoint salePoint) {
		if (this.salePoints.size() <= 10 && (salePoint instanceof MallPoint || salePoint instanceof StreetPoint)) {
			this.salePoints.add(salePoint);
		}
	}

	@Override
	public void addSupplier(Supplier supplier) {
		if (this.suppliers.size() <= 15) {
			this.suppliers.add(supplier);
		}

	}
}
