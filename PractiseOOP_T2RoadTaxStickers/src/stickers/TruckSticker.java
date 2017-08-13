package stickers;

public class TruckSticker extends Sticker {

	static final double priceForDay = 7;

	public TruckSticker(String period) {

		super(period);
		super.timeToStick = 10;
		super.color = "red";
		super.type = "truck";
		super.setValidDateAndPrice(period, priceForDay);

	}

}
