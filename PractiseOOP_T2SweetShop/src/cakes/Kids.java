package cakes;

public class Kids extends Cake {

	private String nameKid;
	// private String sort;

	static String[] typesList = { "birthday", "baptism", "choose career" };
	// List<String> typesKidsCakes = Arrays.asList(typesKidsCakeNames);

	public Kids(String name, String description, double price, int pieces, String type) {
		super(name, price, pieces);
		super.sort = "Kids";
		super.loadTypes(typesList);
		super.setType(type);
		// askForKidName();
		super.setDescription(description);
	}

	private void askForKidName() {
		System.out.println("If you want a special text on the cake, please enter it now or hit 'enter'");
		String nameEntered = sc.nextLine();
		if (nameEntered != null && !nameEntered.isEmpty()) {
			this.nameKid = nameEntered;
		}
	}

	public String getNameKid() {
		if (nameKid != null) {
			return nameKid;
		} else {
			return "No name entered";
		}
	}

}
