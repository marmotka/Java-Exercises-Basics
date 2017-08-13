package cakes;

public class Standart extends Cake {

	static String[] typesList = { "bisquit", "ecler", "fruit", "chocko" };

	public Standart(String name, String description, double price, int pieces, String type) {
		super(name, price, pieces);
		super.sort = "Standart";
		super.loadTypes(typesList);
		super.setType(type);
		super.setDescription(description);
	}

}
