package traders;

import salesPoints.MarketPoint;
import salesPoints.SalePoint;
import salesPoints.StreetPoint;
import suppliers.Retailer;
import suppliers.Supplier;

public class EtTrader extends Trader {

	public EtTrader(String name, String address, double money) {
		super(name, address, money);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPointOfSale(SalePoint salePoint) {
		if (this.salePoints.size() <= 1 && (salePoint instanceof MarketPoint || salePoint instanceof StreetPoint)) {
			this.salePoints.add(salePoint);
		}
	}

	@Override
	public void addSupplier(Supplier supplier) {
		if (this.suppliers.size() <= 5 && supplier instanceof Retailer) {
			this.suppliers.add(supplier);
		}

	}
}
