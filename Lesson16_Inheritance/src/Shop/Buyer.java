package Shop;

public class Buyer {

	private Shop currentShop;
	private double cashBuyer;
	// final private int maxProductsToBuy;
	private Product[] cart;
	private int loadedProducts;

	Buyer(Shop currentShop, double cashBuyer, int maxProductsToBuy) {
		this.currentShop = currentShop;
		this.cashBuyer = cashBuyer;
		// this.maxProductsToBuy = maxProductsToBuy;
		cart = new Product[maxProductsToBuy];
		loadedProducts = 0;
	}

	void loadCart(String name, int quantity) {
		boolean hasProduct = false;
		boolean hasQuantity = false;
		int idxProductLessQuantity = 0;
		if (loadedProducts < cart.length) {
			for (int i = 0; i < currentShop.getList().length; i++) {
				if (name.toLowerCase().equals(currentShop.getList()[i].getName().toLowerCase())) {
					hasProduct = true;
					if (currentShop.getList()[i].getQuantity() >= quantity) {
						hasQuantity = true;
						this.cart[loadedProducts] = new Product(name, currentShop.getList()[i].getPrice(), quantity);
						this.cart[loadedProducts++].setUnit(currentShop.getList()[i].getUnit());
						double newQuantity = currentShop.getList()[i].getQuantity() - quantity;
						currentShop.getList()[i].setQuantity(newQuantity);
						System.out.printf("%.2f %s of %s added in cart%n", (double) quantity,
								currentShop.getList()[i].getUnit(), name);
						break;
					} else {
						idxProductLessQuantity = i;
					}
				}
			}
			if (!hasProduct) {
				System.out.printf("No such product \"%s\"%n", name);
			} else if (!hasQuantity) {
				System.out.printf("Not enough \"%s\" , only %.2f %s left in the store %n", name,
						currentShop.getList()[idxProductLessQuantity].getQuantity(),
						currentShop.getList()[idxProductLessQuantity].getUnit());
			}

		} else {
			System.out.println("Cart is full");
		}

	}

	void unloadCart(String name, int quantity) {
		boolean hasProduct = false;
		boolean hasQuantity = false;
		int idxProduct = 0;
		if (cart.length > 0) {
			for (int i = 0; i < loadedProducts; i++) {
				if (name.toLowerCase().equals(cart[i].getName().toLowerCase())) {
					hasProduct = true;
					idxProduct = i;
					if (quantity <= cart[i].getQuantity()) {
						hasQuantity = true;
						double newQuantity = cart[i].getQuantity() - quantity;
						if (newQuantity == 0) {
							cart[i] = cart[--loadedProducts];
							System.out.printf("You removed %s from your cart%n", cart[i].getName());
						} else {
							cart[i].setQuantity(newQuantity);
							System.out.printf("You removed " + quantity + " %s %s from your cart %n", cart[i].getUnit(),
									cart[i].getName());
						}
						for (int j = 0; j < currentShop.getList().length; j++) {
							if (name.equals(currentShop.getList()[j].getName())) {
								currentShop.getList()[j].setQuantity(currentShop.getList()[j].getQuantity() + quantity);
								break;
							}
						}
						break;
					}
				}
			}
			if (!hasProduct) {
				System.out.printf("No such product \"%s\" in your cart %n", name);
			} else if (!hasQuantity) {
				System.out.printf("You have only %.2f %s %s left in your cart!%n", cart[idxProduct].getQuantity(),
						cart[idxProduct].getUnit(), name);
			}
		} else {
			System.out.println("Cart is empty ");
		}

	}

	void pay() {
		if (cart.length == 0) {
			System.out.println("Cart is empty ");
		} else {
			double sum = 0;
			for (int i = 0; i < loadedProducts; i++) {
				if (sum > cashBuyer) {
					System.out.printf(
							"Not enough money to buy everything.Your bill has reached %.2f lv and you have %.2f lv. Unload something from cart and try again.%n",
							sum, this.cashBuyer);
					break;
				}
				sum += cart[i].getPrice() * cart[i].getQuantity();
			}
			if (sum <= cashBuyer) {
				cashBuyer -= sum;
				currentShop.setMoneyShop(currentShop.getMoneyShop() + sum);
				System.out.printf("You've payed %.2f lv and you have %.2f lv more %n", sum, cashBuyer);
			}
		}
	}

	@Override
	public String toString() {
		System.out.println();
		System.out.println("---Buyer  Cart---");

		for (int i = 0; i < loadedProducts; i++) {
			System.out.printf("price: %.2f | quantity: %.2f | Product: %s %n", cart[i].getPrice(),
					cart[i].getQuantity(), cart[i].getName());
		}
		System.out.println("--- --- --- ---");

		return super.toString();
	}

	// public Product[] getCart() {
	// return cart;
	// }

}
