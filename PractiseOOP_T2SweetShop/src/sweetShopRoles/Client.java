package sweetShopRoles;

public abstract class Client extends ContactDetails {
	private SweetShop shop;
	private int minOrders;
	private int maxOrders;
	private int countOrdersForClient = 0;

	public Client(String name, String phone) {
		super(name, phone);
	}

	public void callShop(SweetShop shop, String address) {
		this.shop = shop;
		shop.takeOrder(this, address);

	}

	int makeOrder() {
		String text = sc.nextLine();
		// StringUtils.isNumeric.
		int number = -1;
		if (text.matches("-?[0-9]+")) {
			number = Integer.parseInt(text);
		}
		return number;
	}

	int makeRandomOrder() {

		if (countOrdersForClient < minOrders) {
			int num = r.nextInt(this.shop.showProducts().size() - 1) + 1;
			countOrdersForClient++;
			return num;
		} else
			return -1;
	}

	boolean aprovePayment(double price) {
		System.out.printf("Your bill is %.2f. Do you confirm the order? Enter 'y' for 'Yes' ", price);
		/* for demo reason */ return true;
		// return sc.nextLine().toLowerCase().equals("y");
	}

	abstract double askForDiscount(double priceWithoutDiscount);

	abstract double giveTip(double priceAfterDiscount);

	protected void setMinOrders(int minOrders) {
		this.minOrders = minOrders;
	}

	protected void setMaxOrders(int maxOrders) {
		this.maxOrders = maxOrders;
	}

	int getMinOrders() {
		return minOrders;
	}

	int getMaxOrders() {
		return maxOrders;
	}

}
