package salesPoints;

import java.time.LocalTime;

public class StreetPoint extends SalePoint {

	public StreetPoint(String name, String address, LocalTime workTime) {
		super(name, address, workTime);
		if (area >= 4 && area <= 6) {
			super.area = area;
		} else {
			super.area = r.nextInt(3) + 4;
		}
		super.taxes = 50;
	}

}
