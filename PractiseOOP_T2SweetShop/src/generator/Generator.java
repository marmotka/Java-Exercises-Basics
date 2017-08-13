package generator;

import java.util.Random;

public class Generator {

	Random r = new Random();

	private String[] first = { "Petar", "Ivan", "Georgi", "Evtim", "John", "Konst", "Teodor", "Bogi" };

	private String[] surname = { "Petrov", "Goergiev", "Dow", "Kirilov", "Petrunov", "Kodor", "Penev", "Торосян" };

	private String[] shopNames = { "Nedelya", "Two Fukli", "Lollipop", "Sweet Dreams", "Wonder Cake" };
	private String[] cakeNames = { "Chocko", "Super cake", "Cake extra", "Sweet Dreams", "Wonder Cake", "Caramel" };

	// private String[] typesStandart = { "bisquit", "ecler", "fruit", "chocko"
	// };
	// private String[] typesWedding = { "big", "middle", "small" };
	// private String[] typesSpecial = { "jubilee", "company", "advertising" };
	// private String[] typesKidsCakeNames = { "birthday", "baptism", "choose
	// career" };
	private String[] sorts = { "Standart", "Wedding", "Special", "Kids" };

	public String genPhone() {
		int lastSix = (r.nextInt(899999) + 100000);
		return "0" + (r.nextBoolean() ? 8 : 9) + (r.nextBoolean() ? 8 : 9) + (r.nextInt(2) + 7) + lastSix;
	}

	public String genPersonName() {
		int first = r.nextInt(8);
		int second = r.nextInt(8);
		return this.first[first] + " " + this.surname[second];
	}

	public String genShopName() {
		int idx = r.nextInt(5);
		return this.shopNames[idx];
	}

	public String genCakeName() {
		int idx = r.nextInt(6);
		return cakeNames[idx];
	}

	// public String genType(int idxSort) {
	// int idxType = r.nextInt(this.typeNames[idxSort].l)
	//
	// }

	public String getSortName() {
		int idx = r.nextInt(4);
		return sorts[idx];
	}

}
