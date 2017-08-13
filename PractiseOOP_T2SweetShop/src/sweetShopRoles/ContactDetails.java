package sweetShopRoles;

import java.util.Random;
import java.util.Scanner;

import generator.Generator;

public class ContactDetails {
	Scanner sc = new Scanner(System.in);
	static Generator g = new Generator();
	static Random r = new Random();
	private String name;
	private String phone;

	public ContactDetails(String name, String phone) {
		setName(name);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public void setPhone(String phone) {
		// if (phone != null && phone.matches("[0-9]") && phone.length() == 10)
		// {
		this.phone = phone;
		// }
	}

}
