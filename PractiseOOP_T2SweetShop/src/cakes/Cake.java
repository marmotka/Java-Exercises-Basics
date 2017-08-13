package cakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import generator.Generator;

public abstract class Cake {
	Scanner sc = new Scanner(System.in);
	static Generator g = new Generator();
	static Random r = new Random();
	// if you want to add new sort - add name here and create class
	private static String[] sorts = { "Standart", "Wedding", "Special", "Kids" };

	private String name;
	private String description;
	private double price;
	private int pieces;
	protected String sort;
	protected String type;

	protected ArrayList<String> types;

	protected Cake(String name, double price, int pieces) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Delicious Cake";
		}
		if (price > 0) {
			this.price = price;
		}
		if (pieces > 6 && pieces < 30) {
			this.pieces = pieces;
		}

	}

	protected void loadTypes(String[] listTypes) {
		types = new ArrayList<String>(Arrays.asList(listTypes));
	}

	private boolean ifTypeExist(String typeName) {
		return types.contains(typeName);
	}

	private void askToaddNewType(String typeName) {
		System.out.println(
				"This is a custom type of cake, do you want to be added in the list for future orders? [y for 'Yes', any key for 'No']");
		boolean shouldAdd = sc.nextLine().equals("y");
		if (shouldAdd) {
			System.out.println("Added in list of types");
			types.add(typeName);
			type = typeName;
		} else {
			type = typeName;
			System.out.println("Not added in list of types, exceptional order");
		}
	}

	protected void setType(String type) {
		if (ifTypeExist(type)) {
			this.type = type;
		} else {
			askToaddNewType(type);
		}
	}

	protected void setDescription(String description) {
		if (description == null) {
			this.description = this.sort + "-" + this.type;
		} else {
			this.description = description;
		}
	}

	@Override
	public String toString() {
		String info = String.format(
				"---***---\nCake name: %s \nCake description: %s \nCake price: %.2f \nCake pieces: %d\n Cake sort: %s\n Cake type: %s\n ---***---\n ",
				this.name, this.description, this.price, this.pieces, this.sort, this.type);
		return info;
	}

	public static Cake genRandomCake() {
		String name = g.genCakeName();
		int price = (r.nextInt(3) + 1) * 10 - 1;
		int pieces = (r.nextInt(2) + 1) * 10;
		int sortIdx = r.nextInt(sorts.length);
		switch (sortIdx) {
		case 0:
			int idx = r.nextInt(Standart.typesList.length);
			return new Standart(name, null, price, pieces, Standart.typesList[idx]);

		case 1:
			int idx1 = r.nextInt(Wedding.typesList.length);
			return new Wedding(name, null, price, pieces, Wedding.typesList[idx1]);
		case 2:
			int idx2 = r.nextInt(Special.typesList.length);
			return new Special(name, null, price, pieces, Special.typesList[idx2]);
		case 3:
			int idx3 = r.nextInt(Kids.typesList.length);
			return new Kids(name, null, price, pieces, Kids.typesList[idx3]);
		default:
			int idx4 = r.nextInt(Standart.typesList.length);
			return new Standart(name, null, price, pieces, Standart.typesList[idx4]);
		}
	}

	public double getPrice() {
		return price;
	}

	protected String getType() {
		return type;
	}

	public String getName() {
		return name;
	}
}
