package Shop;

public class Product {
	private String name;
	private double price;
	private double quantity;
	private String unit;



	Product(String name, double price, double quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && name.length() > 0 && name.matches("[a-zA-Z ]+")) {
			this.name = name;
		}
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		}
	}
	
	protected void setUnit(final String unit) {
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

}
