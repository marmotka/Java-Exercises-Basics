package CarShop;

public class Person {

	private String name;
	private int age;
	private int weight;
	Person[] friends;
	private long personalNumber;
	private boolean isMale;
	private double money;
	private Car car;

	Person() {
		age = 18;
		weight = 50;
	}

	public Person(String name, int age) {
		this();
		setName(name);
		this.age = age;
	}

	public Person(String name, long personalNumber, boolean isMale) {
		this();
		setName(name);
		setPersonalNumber(personalNumber);
		this.isMale = isMale;
		friends = new Person[3];
	}

	void buyCar(Car car){
		if (this.money>=car.getPrice()){
			this.car = car;
			this.money-=car.getPrice();
		}
	}
	
	double sellCarForScrap(){
		this.money +=car.calcCarPriceScrap(car.metalPrice);
		return this.money;
	}
	
	
	protected void setName(String name) {
		if (name.length() > 0 && name.matches("^[\\p{L} .'-]+$")) {
			this.name = name;
		} else {
			System.out.println("Invalid name");
		}
	}

	protected void setPersonalNumber(long personalNumber) {
		if (Long.toString(personalNumber).matches("[1-9][0-9]{9}")) {
			this.personalNumber = personalNumber;
		}
	}

}
