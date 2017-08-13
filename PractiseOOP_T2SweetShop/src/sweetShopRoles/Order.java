package sweetShopRoles;

import java.util.ArrayList;

import cakes.Cake;

class Order extends ContactDetails {
	private static int ordersGenerated;
	// private int number;
	private Client client;
	private double priceShopGets;
	private double priceTipProvider;
	// private double priceForClient;
	private SweetShop shop;
	private String address;
	private ArrayList<Cake> cakesInOrder = new ArrayList<>();
	private Provider deliverMan;

	Order(SweetShop shop, Client client, String address) {
		super(client.getName(), client.getPhone());
		this.shop = shop;
		this.client = client;
		this.address = address;
		System.out.printf("---------------New order from client %s --------------- \n", this.client.getName());
		// this.number = ordersGenerated++;

		addCakesInOrder(this.client);
	}

	double calcPriceForClient() {
		double priceBeforeDiscount = 0;
		for (Cake cake : cakesInOrder) {
			priceBeforeDiscount += cake.getPrice();
		}

		double priceAfterDiscount = client.askForDiscount(priceBeforeDiscount);
		double tip;
		double totalPrice;
		if (priceAfterDiscount < 0) {
			System.out.println("You will pay with vauchers only. \n Tip is still required");
			priceAfterDiscount = 0;
			tip = client.giveTip(priceBeforeDiscount);
			totalPrice = tip;
		} else {
			tip = client.giveTip(priceAfterDiscount);
			totalPrice = priceAfterDiscount + tip;
		}
		this.priceTipProvider = tip;
		this.priceShopGets = priceAfterDiscount;
		// this.priceForClient = totalPrice;
		return totalPrice;
	}

	void addCakesInOrder(Client client) {
		int numberFromCatalog = -1;
		int addedProducts = 0;
		if (this.shop.showProducts().size() == 0) {
			return;
		}
		do {
			System.out.println(
					"Please add the number of the cake from our catalog you would like to add in your order. If you want to finish your order -> type '-1'\n");
			numberFromCatalog = client.makeRandomOrder();
			if (numberFromCatalog > 0 && numberFromCatalog < this.shop.showProducts().size()) {
				if (addedProducts <= client.getMaxOrders()) {
					System.out.printf("Cake '%s' was added in your order\n\n",
							this.shop.showProducts().get(numberFromCatalog).getName());
					addedProducts++;
					this.cakesInOrder.add(this.shop.setProducts().get(numberFromCatalog));
					this.shop.setProducts().remove(numberFromCatalog);
				} else {
					System.out.println("You reached the limit of your orders!  \n");
					numberFromCatalog = -1;
				}
			} else if (numberFromCatalog == -1) {
				if (addedProducts < client.getMinOrders()) {
					System.out.printf(
							"You haven't added enough products in your order. You should add %d more products \n",
							client.getMinOrders() - addedProducts);
					numberFromCatalog = 0;
				} else {
					System.out.println("Finishing order...");
				}
			} else {
				System.out.println("No such number in our catalog\n");
			}
		} while (numberFromCatalog != -1);

		finilizeOrder(client);
	}

	private void printProductsFromOrder() {
		System.out.println("Products from order: ");
		for (Cake cake : cakesInOrder) {
			System.out.println(cake.toString());
			System.out.println();
		}
	}

	private void finilizeOrder(Client client2) {
		printProductsFromOrder();
		if (client2.aprovePayment(calcPriceForClient())) {
			this.shop.getOrders().add(this);
			this.shop.assignProvider(this);
			System.out.println("Payment approved \n");

		} else {
			System.out.println("Order is canceled! \n");
		}
	}

	double getPriceShopGets() {
		return priceShopGets;
	}

	double getPriceTipProvider() {
		return priceTipProvider;
	}

	public String printCakesInOrder() {
		return cakesInOrder.toString();
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setProvider(Provider provider) {
		this.deliverMan = provider;

	}

	Provider getProvider() {

		return this.deliverMan;
	}

	SweetShop getShop() {
		return shop;
	}

	Client getClient() {
		return client;
	}

}
