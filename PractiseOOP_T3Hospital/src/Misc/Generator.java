package Misc;

import java.util.Random;

public class Generator {

	Random r = new Random();
	private String[] first = { "Petar", "Ivan", "Georgi", "Evtim", "John", "Konst", "Teodor", "Bogi" };

	private String[] surname = { "Petrov", "Goergiev", "Dow", "Kirilov", "Petrunov", "Kodor", "Penev", "Торосян" };

	private String[] medicines = { "Aspirin", "Alcazalcer", "Enterol", "Espumisan", "Dopamin", "Простанол Уно" };

	public String genName() {
		int first = r.nextInt(8);
		int second = r.nextInt(8);

		return this.first[first] + " " + this.surname[second];
	}

	public String genDiagnosis() {
		int guess = r.nextInt(3) + 1;

		switch (guess) {
		case 1:
			return "Cardiology";
		case 2:
			return "Virusology";
		default:
			return "Ortopedy";
		}
	}

	public String getMedicines() {
		return medicines[r.nextInt(6)];
	}

}
