package suppliers;

import java.util.Random;

public abstract class Person {
	private String name;
	private String address;
	protected double money;

	public static Random r = new Random();

	protected Person(String name, String address) {
		if (name != null && !name.isEmpty())
			this.name = name;
		if (address != null && !address.isEmpty())
			this.address = address;
	}

	public String getName() {
		return name;
	}

}
