package sweetShopRoles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import cakes.Cake;

public class SweetShop extends ContactDetails {

	private String address;
	private double money;
	private ArrayList<Provider> employees = new ArrayList<>();
	private ArrayList<Cake> products = new ArrayList<Cake>();
	private ArrayList<Order> orders = new ArrayList<>();

	public SweetShop(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	public static SweetShop genRandomShop() {
		SweetShop randomShop = new SweetShop("Sweet talents", g.genPhone());
		for (int i = 0; i < 5; i++) {
			randomShop.employProvider(Provider.genRandomProvider());
		}
		for (int i = 0; i < 30; i++) {
			randomShop.products.add(Cake.genRandomCake());
		}
		return randomShop;
	}

	private void employProvider(Provider p) {
		if (p != null) {
			employees.add(p);
		}
	}

	public void takeOrder(Client client, String addess) {
		Order order = new Order(this, client, addess);
		order.getProvider().deliver(order);
	}

	void addMoneyInShop(double moneyFromOrders) {
		this.money += moneyFromOrders;
	}

	ArrayList<Order> getOrders() {
		return orders;
	}

	ArrayList<Cake> setProducts() {
		return products;
	}

	public ArrayList<Cake> showProducts() {
		return new ArrayList<Cake>(products);
	}

	void assignProvider(Order order) {
		this.sortEmployeesByIncreasingOrder();
		order.setProvider(employees.get(0));
		order.getProvider().addOrderToDeliver(order);
		System.out.printf("\n Deliverman name: %s \n", order.getProvider().getName());

	}

	private void sortEmployeesByIncreasingOrder() {
		employees.sort(Comparator.comparingInt(Provider::numberOrdersToDeliver));
	}

	public void printBestEmployeeByTip() {
		Collections.sort(employees, Collections.reverseOrder(Comparator.comparingDouble(Provider::getMoney)));
		for (Provider provider : employees) {
			System.out.printf("%s - money: %.2f ", provider.getName(), provider.getMoney());
		}
		// employees.sort(Comparator.comparingDouble(Provider::getMoney));
		// for (int i = employees.size() - 1; i >= 0; i++) {
		// System.out.printf("%s - money: %.2f ", employees.get(i).getName(),
		// employees.get(i).getMoney());
		// }
	}

	public String printProducts() {
		System.out.println("**************Products in shop****************");
		StringBuilder text = new StringBuilder();
		for (Cake cake : products) {
			text.append(cake.toString());
			text.append("\n");
		}
		return text.toString();
	}

	public double getMoney() {
		return this.money;
	}
}
