package participants;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import stickers.BusSticker;
import stickers.CarSticker;
import stickers.Sticker;
import stickers.TruckSticker;

public class GasStation {
	Random r = new Random();

	private double money;
	private ArrayList<Sticker> products = new ArrayList<>();

	public GasStation(double money) {
		if (money > 0) {
			this.money = money;
		}
		generateRandomStickers(1000);
		showProducts();
	}

	public Sticker sellSticker(Driver client, String typeAuto, String period) {
		Sticker sticker = returnStickerNumberIfAvailable(typeAuto, period);
		if (sticker == null) {
			System.out.println("Apologise, don't have available product now\n");
		} else {
			double price = sticker.getPrice();
			boolean hasPayed = client.giveMoney(price);
			if (hasPayed) {
				this.money += price;
				products.remove(sticker);
			}
		}
		return sticker;
	}

	public void showProducts() {
		for (Sticker sticker : products) {
			System.out.printf("Sticker type: %s , period: %s , color: %s , validTill: %s \n", sticker.getType(),
					sticker.getPeriod(), sticker.getColor(), sticker.showalidDate());
		}
	}

	private Sticker returnStickerNumberIfAvailable(String typeAuto, String period) {
		for (Sticker sticker : products) {
			if (sticker.getType().equals(typeAuto) && sticker.getPeriod().equals(period)) {
				return sticker;
			}
		}
		return null;
	}

	private void generateRandomStickers(int number) {

		for (int j = 0; j < number; j++) {

			int rndPeriod = r.nextInt(3);
			String[] periods = { "day", "month", "year" };
			int rndType = r.nextInt(3);
			switch (rndType) {
			case 1:
				products.add(new BusSticker(periods[rndPeriod]));
				break;
			case 2:
				products.add(new CarSticker(periods[rndPeriod]));
				break;
			case 0:
				products.add(new TruckSticker(periods[rndPeriod]));
				break;
			}

		}
		products.sort(Comparator.comparingDouble(Sticker::getPrice));
	}

}
