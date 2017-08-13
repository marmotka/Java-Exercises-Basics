package suppliers;

import java.time.LocalTime;

public class WholeSale extends Supplier {

	public WholeSale(String name, String address, LocalTime workTime) {
		super(name, address, workTime);
		super.discount = 0.85;
	}

}
