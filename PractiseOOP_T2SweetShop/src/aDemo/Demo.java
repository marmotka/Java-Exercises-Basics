package aDemo;

import java.util.ArrayList;

import generator.Generator;
import sweetShopRoles.Client;
import sweetShopRoles.ClientCorporate;
import sweetShopRoles.ClientPrivate;
import sweetShopRoles.SweetShop;

public class Demo {

	public static void main(String[] args) {

		Generator g = new Generator();
		ArrayList<Client> waitingCLients = new ArrayList<>(10);

		SweetShop shopche = SweetShop.genRandomShop();

		for (int i = 0; i < 5; i++) {
			waitingCLients.add(new ClientCorporate(g.genPersonName(), g.genPhone()));
		}
		for (int i = 0; i < 5; i++) {
			waitingCLients.add(new ClientPrivate(g.genPersonName(), g.genPhone()));
		}
		for (Client client : waitingCLients) {
			client.callShop(shopche, "str. 'Chocko experience' 22");
		}

		System.out.println(shopche.printProducts());
		System.out.printf("Income at the moment: %.2f\n", shopche.getMoney());
	}
}