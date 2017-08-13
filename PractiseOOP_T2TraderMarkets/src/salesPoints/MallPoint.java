package salesPoints;

import java.time.LocalTime;

public class MallPoint extends SalePoint {

	public MallPoint(String name, String address, LocalTime workTime) {
		super(name, address, workTime);
		if (area >= 10 && area <= 100) {
			super.area = area;
		} else {
			super.area = r.nextInt(91) + 10;
		}
		super.taxes = 150;
	}

}
