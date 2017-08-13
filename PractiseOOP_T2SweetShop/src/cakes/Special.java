package cakes;

public class Special extends Cake {

	static String[] typesList = { "jubilee", "company", "advertising" };

	public Special(String name, String description, double price, int pieces, String type) {
		super(name, price, pieces);
		super.sort = "Special";
		super.loadTypes(typesList);
		super.setType(type);
		super.setDescription(description);
	}

}
