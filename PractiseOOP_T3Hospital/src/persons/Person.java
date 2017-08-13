package persons;

import hospital.Ordinatory;

public abstract class Person {

	private String name;
	private String phoneNumber;
	private Ordinatory ordinatory;

	protected Person(String name, String phoneNumber) {
		setName(name);
		setPhoneNumber(phoneNumber);
	}

	private void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	private void setPhoneNumber(String phoneNumber) {
		if (phoneNumber != null && phoneNumber.length() == 6) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("Number should be 10 digits -  0*** *** ***");
		}
	}

	public void setOrdinatory(Ordinatory ordinatory) {
		this.ordinatory = ordinatory;
	}

	public Ordinatory getOrdinatory() {
		return ordinatory;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
