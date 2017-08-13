package sweetShopRoles;

import java.util.ArrayList;

class Provider extends ContactDetails {
	private double money;
	private ArrayList<Order> ordersToDeliver = new ArrayList<>();

	public Provider(String name, String phone) {
		super(name, phone);
	}

	static Provider genRandomProvider() {
		return new Provider(g.genPersonName(), g.genPhone());
	}

	public void addOrderToDeliver(Order order) {
		this.ordersToDeliver.add(order);
	}

	int numberOrdersToDeliver() {
		return ordersToDeliver.size();
	}

	void deliver(Order order) {
		System.out.printf("Order to client %s is delivered. \n", order.getClient().getName());
		order.getShop().addMoneyInShop(order.getPriceShopGets());
		System.out.printf("money for shop %.2f \n", order.getPriceShopGets());
		this.money += order.getPriceTipProvider();
		System.out.printf("money for provider %.2f \n", order.getPriceTipProvider());
		System.out.println("Order is finished! \n");
	}

	public double getMoney() {
		return money;
	}
}
