package demo;

import java.util.Random;

import Misc.Generator;
import hospital.Hospital;
import persons.Patient;

public class Demo {
	public static void main(String[] args) {

		Hospital hospital = new Hospital("Pirogov");
		Generator g = new Generator();
		Random r = new Random();

		for (int i = 0; i < 5; i++) {

			int n = 100000 + r.nextInt(900000);
			String phone = Integer.toString(n);

			Patient patient = new Patient(g.genName(), phone, (r.nextBoolean() == true ? 'M' : 'F'), 19);
			patient.visitHospital(hospital);
			patient.getPlan().printPlan();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("----------------------------------SUN IS SHINING----------------------------------");
			hospital.dailyPlan();

		}

	}
}