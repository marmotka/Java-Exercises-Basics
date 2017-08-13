package aDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import automobiles.Autos;
import participants.Driver;
import participants.GasStation;

public class Demo {
	static Random r = new Random();
	static String[] first = { "Petar", "Ivan", "Georgi", "Evtim", "John", "Konst", "Teodor", "Bogi" };
	static String[] surname = { "Petrov", "Goergiev", "Dow", "Kirilov", "Petrunov", "Kodor", "Penev", "Торосян" };
	static String[] models = { "audi", "bmw", "toyota", "lada", "mercedess" };
	static String[] typeSticekrs = { "day", "month", "year" };
	static String[] typeAuto = { "car", "truck", "bus" };

	// String[] medicines = { "Aspirin", "Alcazalcer", "Enterol", "Espumisan",
	// "Dopamin", "Простанол Уно" };

	public static String genName() {
		int first = r.nextInt(8);
		int second = r.nextInt(8);

		return Demo.first[first] + " " + Demo.surname[second];
	}

	public static void main(String[] args) {

		GasStation localStation = new GasStation(2000);
		ArrayList<Driver> driversInStore = new ArrayList<Driver>();
		ArrayList<Autos> allAutos = new ArrayList<Autos>();
		ArrayList<Autos> allExpTrucks = new ArrayList<Autos>();
		// String [] names = {"Pesho", "Gosho", "Tosho", "John"};

		for (int i = 0; i < 20; i++) {
			Driver driver = new Driver(("Client " + i), r.nextDouble() * 10000 + 1);
			driversInStore.add(driver);
			driver.setCurrentStation(localStation);
		}

		// for (int i = 0; i < 100; i++) {
		for (Driver driver : driversInStore) {
			for (int j = 0; j < 10; j++) {
				Autos auto = new Autos(models[r.nextInt(models.length)], 1980 + r.nextInt(25), typeAuto[r.nextInt(3)]);
				driver.addAutos(auto);
				allAutos.add(auto);
			}
			// }
		}
		for (int i = 0; i < driversInStore.size(); i++) {
			Driver driver = driversInStore.get(i);
			if (i % 3 == 0) {
				for (int j = 0; j < 5; j++) {
					int rndAutoNum = r.nextInt(driver.getAutos().size());

					driver.buyOneSticker(localStation, rndAutoNum, typeSticekrs[r.nextInt(3)]);
				}
			}
			driver.buyStickersForAll(localStation, typeSticekrs[r.nextInt(3)]);

		}

		for (Driver driver : driversInStore) {
			System.out.printf("%s has %d cars to operate with. \n", driver.getName(), driver.getAutos().size());

			System.out.printf("Has %d cars with expiring sticker on that day \n",
					driver.checkAutosForValidStickers(LocalDate.parse("2017-09-10")).size());
			System.out.printf(", has %.2f lv\n", driver.getMoney());
		}

		for (Driver driver : driversInStore) {

			for (Autos autos2 : driver.getAutos()) {

				if (autos2.getType().equals("truck") && autos2.hasValidSticker(LocalDate.parse("2017-09-10"))) {

					allExpTrucks.add(autos2);
					System.out.println(autos2.toString());
				}
			}

		}
	}
}