package sweetShopRoles;

public class ClientCorporate extends Client {

	private int percentDiscount;

	public ClientCorporate(String name, String phone) {
		super(name, phone);
		super.setMinOrders(3);
		super.setMaxOrders(5);
		this.percentDiscount = r.nextInt(11) + 5;

	}

	@Override
	double askForDiscount(double priceWithoutDiscount) {
		double total = priceWithoutDiscount * ((100.0 - percentDiscount) / 100.0);
		return total;
	}

	@Override
	double giveTip(double priceAfterDiscount) {
		return 0.05 * priceAfterDiscount;
	}

	// @Override
	// protected void setMinOrders(int minOrders) {
	// super.setMinOrders(minOrders);
	// }
	//
	// @Override
	// protected void setMaxOrders(int maxOrders) {
	// super.setMaxOrders(maxOrders);
	// }

}
