package participants;

import java.time.LocalDate;
import java.util.ArrayList;

import automobiles.Autos;
import stickers.Sticker;

public class Driver {

	private String name;
	private ArrayList<Autos> autos;
	private ArrayList<Autos> autosInvalidStickers;
	private double money;
	private GasStation currentStation;

	public Driver(String name, double money) {
		autos = new ArrayList<>();
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (money > 0) {
			this.money = money;
		}

	}

	public ArrayList<Autos> getAutos() {
		return autos;
	}

	public String getName() {
		return name;
	}

	public void addAutos(Autos auto) {
		if (auto != null)
			this.autos.add(auto);
	}

	public void setCurrentStation(GasStation currentStation) {
		if (currentStation != null) {
			this.currentStation = currentStation;
		}
	}

	public void buyOneSticker(GasStation station, int numberOfAutoInList, String period) {
		Sticker sticker = station.sellSticker(this, autos.get(numberOfAutoInList).getType(), period);
		if (sticker != null) {
			autos.get(numberOfAutoInList).setSticker(sticker);
			sticker.getStick();
		}

	}

	public void buyStickersForAll(GasStation station, String period) {
		for (int i = 0; i < this.autos.size(); i++) {
			buyOneSticker(station, i, period);
		}

	}

	public double getMoney() {
		return money;
	}

	public ArrayList<Autos> checkAutosForValidStickers(LocalDate dateCheck) {
		this.autosInvalidStickers = new ArrayList<>();
		for (Autos automobile : autos) {
			if (!automobile.hasValidSticker(dateCheck)) {
				autosInvalidStickers.add(automobile);
			}
		}
		return autosInvalidStickers;
	}

	public boolean giveMoney(double price) {
		if (price <= this.money) {
			this.money -= price;
			return true;
		} else {
			System.out.println("Sorry not enough money\n");
			return false;
		}
	}

}
