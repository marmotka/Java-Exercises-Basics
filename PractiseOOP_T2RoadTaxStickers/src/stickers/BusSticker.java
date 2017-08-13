package stickers;

public class BusSticker extends Sticker {

	static final double priceForDay = 9;

	public BusSticker(String period) {

		super(period);
		super.timeToStick = 20;
		super.color = "green";
		super.type = "bus";
		super.setValidDateAndPrice(period, priceForDay);
	}

}
