package Shop;

public class Shop {
	private String name;
	private String address;
	private double moneyShop;
	private Product[] list;
	private int loadedProducts = 0;
	// private int countProducts;

	Shop(int countProducts) {
		this.name = "Neibourgh Shop";
		this.address = "street: unknown";
		this.moneyShop = 10000;
		list = new Product[countProducts];

	}

	double getMoneyShop() {
		return moneyShop;
	}

	void setMoneyShop(double moneyShop) {
		this.moneyShop = moneyShop;
	}

	Shop(String name, String address, double moneyShop, int countProducts) {
		this.name = name;
		this.address = address;
		this.moneyShop = moneyShop;
		list = new Product[countProducts];

	}

	void loadProducts(Product prod) {
		list[loadedProducts++] = prod;
	}

	public Product[] getList() {
		return list;
	}

	@Override
	public String toString() {
		System.out.println();
		String nameWidth = String.format("Shop name: --- %s ---", this.name);
		System.out.println(nameWidth);
		System.out.println(printSymbols('-', nameWidth.length()));
		System.out.printf("address: --- %s ---%n", this.address);
		System.out.printf("Has cash: --- %s ---%n", this.moneyShop);
		System.out.println("--- Products in shop --- ");
		for (int i = 0; i < list.length; i++) {
			System.out.printf("price: %.2f | quantity: %.2f | Product: %s %n", list[i].getPrice(),
					list[i].getQuantity(), list[i].getName());
		}
		System.out.println("--- --- --- ---");

		return super.toString();
	}

	private StringBuilder printSymbols(char ch, int count) {
		StringBuilder txt = new StringBuilder();
		for (int i = 0; i < count; i++) {
			txt = txt.append(ch);
		}
		return txt;
	}

}
