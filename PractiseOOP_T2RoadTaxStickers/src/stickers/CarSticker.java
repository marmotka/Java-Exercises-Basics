package stickers;

public class CarSticker extends Sticker {
	static final double priceForDay = 5;

	public CarSticker(String period) {
		super(period);
		super.timeToStick = 5;
		super.color = "yellow";
		super.type = "car";
		super.setValidDateAndPrice(period, priceForDay);

	}

}
