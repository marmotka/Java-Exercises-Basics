package stickers;

import java.time.LocalDate;

public abstract class Sticker {

	private LocalDate issueDate;
	private LocalDate validDate;
	private String period;

	protected int timeToStick;
	protected String color;
	protected String type;
	protected double price;

	// protected double priceForDay;

	protected Sticker(String period) {
		this.issueDate = LocalDate.now();
		// this.priceForDay=this.priceForDay;

	}

	public int getStick() {
		System.out.printf("Sticker is sticked for %d seconds\n", timeToStick);
		return timeToStick;
	}

	protected void setValidDateAndPrice(String period, double priceForDay) {
		this.period = period;
		if (period.equals("day")) {
			this.validDate = issueDate.plusDays(1);
			this.price = priceForDay;
		} else if (period.equals("month")) {
			this.validDate = issueDate.plusMonths(1);
			this.price = priceForDay * 10;
		} else if (period.equals("year")) {
			this.validDate = issueDate.plusYears(1);
			this.price = priceForDay * 10 * 6;
		}
	}

	public String getColor() {
		return color;
	}

	public String showalidDate() {
		return validDate.toString();
	}

	public String getType() {
		return this.type;

	}

	public double getPrice() {
		return price;
	}

	public String getPeriod() {
		return period;
	}

	public boolean isValidTill(LocalDate dateCheck) {
		if (this.validDate.compareTo(dateCheck) <= 0) {
			return true;
		}
		return false;
	}

}
