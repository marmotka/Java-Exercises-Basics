package suppliers;

import java.time.LocalTime;

public class Retailer extends Supplier {

	public Retailer(String name, String address, LocalTime workTime) {
		super(name, address, workTime);
		super.discount = 1;
	}

}
