package persons;

import java.util.ArrayList;

import documents.Plan;
import hospital.Hospital;

public class Doctor extends Person {

	private String speciality;
	private Hospital workPlace;
	private ArrayList<Patient> patients = new ArrayList<>();
	private boolean isBusy;

	public Doctor(String name, String phoneNumber, String speciality) {
		super(name, phoneNumber);
		this.isBusy = false;
	}

	public void addPatient(Patient p) {
		if (p == null) {
			System.out.println("[ERROR] No patient requred to be added!\n");
			return;
		}
		patients.add(p);
		System.out.printf("Patient %s added in the list of dr. %s \n", p.getName(), this.getName());
		planTreatment(p);

		if (this.patients.size() == 3) {
			this.isBusy = true;
		}
	}

	private void planTreatment(Patient p) {
		p.setPlan(new Plan(p));

	}

	public void visit() {
		for (int i = 0; i < patients.size(); i++) {
			System.out.printf("Dr %s visited patient %s in room %d from ordinatory %s \n", this.getName(),
					patients.get(i).getName(), patients.get(i).getRoomNumber(),
					patients.get(i).getOrdinatory().getType());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean isBusy() {
		return isBusy;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	// public void getEmplyed(Hospital hospital) {
	// for (int i = 0; i < hospital.getOrdinatories().length; i++) {
	// if (speciality.equals(hospital.getOrdinatories()[i].getType())) {
	//
	// this.setOrdinatory(hospital.getOrdinatories()[i]);
	// this.workPlace = hospital;
	//
	// System.out.printf("Dr. %s was employed in hospital %s in ordinatory
	// %s\n", this.getName(),
	// hospital.getName(), hospital.getOrdinatories()[i].getType());
	// // TODO add doctor in hoospital list
	// }
	// }
	// }
}
