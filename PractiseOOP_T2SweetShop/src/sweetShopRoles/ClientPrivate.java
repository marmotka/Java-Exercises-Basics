package sweetShopRoles;

public class ClientPrivate extends Client {

	int maxCountVauchers = 4;
	int[] allVauchers = new int[maxCountVauchers];

	public ClientPrivate(String name, String phone) {
		super(name, phone);
		super.setMinOrders(1);
		super.setMaxOrders(3);
		genVauchers();

	}

	private void genVauchers() {
		int currentCountVauchers = r.nextInt(maxCountVauchers) + 1;
		for (int i = 0; i < currentCountVauchers; i++) {
			int valueOfVaucher = r.nextInt(21) + 10;
			allVauchers[i] = valueOfVaucher;
		}
	}

	@Override
	double askForDiscount(double priceWithoutDiscount) {
		double sumVauchers = 0;
		for (int i = 0; i < allVauchers.length; i++) {
			if (sumVauchers < priceWithoutDiscount) {
				sumVauchers += allVauchers[i];
				allVauchers[i] = 0;
			} else {

				break;
			}
		}
		return priceWithoutDiscount - sumVauchers;
	}

	@Override
	double giveTip(double priceAfterDiscount) {
		return 0.02 * priceAfterDiscount;

	}

}
