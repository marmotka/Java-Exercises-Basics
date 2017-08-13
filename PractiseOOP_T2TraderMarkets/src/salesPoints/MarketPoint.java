package salesPoints;

import java.time.LocalTime;

public class MarketPoint extends SalePoint {

	public MarketPoint(String name, String address, LocalTime workTime, int area) {
		super(name, address, workTime);
		if (area >= 5 && area <= 10) {
			super.area = area;
		} else {
			super.area = r.nextInt(5) + 5;
		}
		super.taxes = 50;
	}

}
