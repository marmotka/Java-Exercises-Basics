package hospital;

import persons.Patient;

public class Room {
	private static int counter = 1;
	private char gender = '*';
	private int number;
	private Patient[] beds = new Patient[3];

	public Room() {
		this.number = counter++;
	}

	public boolean hasAvailableBed(Patient patient) {
		if (gender == '*') {
			return true;
		}
		if (this.gender == patient.getGender()) {
			for (int i = 0; i < beds.length; i++) {
				if (beds[i] != null) {
					return true;
				}
			}
		}
		return false;
	}

	public void placePatient(Patient p) {
		if (this.gender == '*') {
			this.gender = p.getGender();
		}
		for (int i = 0; i < beds.length; i++) {
			if (beds[i] == null) {
				beds[i] = p;
				break;
			}
		}

	}

	public void emptyBed(Patient p) {
		int countEmptyBeds = beds.length;
		for (int i = 0; i < beds.length; i++) {
			if (beds[i] != null) {
				countEmptyBeds--;
				if (beds[i] == p) {
					beds[i] = null;
					countEmptyBeds++;
				}
			}
		}
		if (countEmptyBeds == beds.length) {
			this.gender = '*';
		}
	}

	public int getNumber() {
		return number;
	}

	public Patient[] getBeds() {
		return beds;
	}

	// public void addPatient(Patient patient) {
	// if (beds[0] == null && beds[1] == null && beds[2] == null) {
	// this.gender = (patient.isMale() ? 'M' : 'F');
	// }
	//
	// boolean isAdded = false;
	// for (int i = 0; i < this.beds.length; i++) {
	// if (beds[i] == null) {
	// this.beds[i] = patient;
	// System.out.println("Прациентът " + patient.getName() + " беше приет в
	// стая номер " + this.number);
	// isAdded = true;
	// break;
	// }
	// }
	// if (!isAdded) {
	// System.out.println("Прациентът " + patient.getName() + " не беше
	// приет.");
	// }
	// }

	// public boolean bedIsEmpty(int idx){
	// if (idx<0 || idx<beds.length){
	// System.out.println("Not such bed in the room");
	// return true; //TODO throw exception
	// } else {
	//
	// }
	// }

}
