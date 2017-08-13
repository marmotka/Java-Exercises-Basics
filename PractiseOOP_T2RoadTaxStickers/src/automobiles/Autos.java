package automobiles;

import java.time.LocalDate;

import stickers.Sticker;

public class Autos {

	private String model;
	private Sticker sticker;
	private int yearMade;
	private String type;

	public Autos(String model, int yearMade, String type) {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		}
		int thisYear = LocalDate.now().getYear();
		if (yearMade > 1900 && yearMade < thisYear) {
			this.yearMade = yearMade;
		}
		if (type.equals("car") || type.equals("bus") || type.equals("truck")) {
			this.type = type;
		}
	}

	public Sticker getSticker() {
		return sticker;
	}

	public void setSticker(Sticker sticker) {
		if (sticker != null && this.type.equals((sticker).getType())) {
			this.sticker = sticker;

		}
	}

	public String getType() {
		return this.type;
	}

	public boolean hasValidSticker(LocalDate dateCheck) {
		return (this.sticker != null && this.sticker.isValidTill(dateCheck));
	}

	@Override
	public String toString() {
		String txt = "type: " + this.type + " model: " + this.model + " year: " + this.yearMade;

		return txt;
	}
}
