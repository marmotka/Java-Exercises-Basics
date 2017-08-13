package cakes;

public class Wedding extends Cake {

	static String[] typesList = { "big", "middle", "small" };

	public Wedding(String name, String description, double price, int pieces, String type) {
		super(name, price, pieces);
		super.sort = "Wedding";
		super.loadTypes(typesList);
		super.setType(type);
		super.setDescription(description);
	}

}
