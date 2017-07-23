package CarShop;

public class Car {

	private String model;
	private boolean isSportCar;
	private String color;

	private int currentGear;
	private double currentSpeed;

	private Person owner;
	private double price;

	private double maxSpeed;
	double metalPrice;

	Car() {
		currentGear = 1;
		currentSpeed = 0;
	}

	Car(String model, boolean isSportCar, String color) {
		this();
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
	}

	boolean isMoreExpensive(Car car) {
		return this.price > car.price;
	}

	double calcCarPriceScrap(double metalPrice) {
		double coef = 0.2;
		if (this.color.equals("black") || this.color.equals("white")) {
			coef += 0.05;
		}
		if (isSportCar) {
			coef += 0.05;
		}
		return metalPrice * coef;
	}

	void changeOwner(Person owner) {
		this.owner = owner;
	}

	double getPrice() {
		return price;
	}

	String getModel() {
		return model;
	}
}
