package hospital;

import java.util.ArrayList;
import java.util.Random;

import Misc.Generator;
import persons.Doctor;
import persons.Nurse;
import persons.Patient;

public class Hospital {

	Random r = new Random();

	private String name;

	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Nurse> nurses = new ArrayList<Nurse>();
	private Ordinatory[] ordinatories = new Ordinatory[3];
	// private ArrayList<Patient> waitingList = new ArrayList<>();
	private ArrayList<Patient> releaseList = new ArrayList<>();

	Generator g = new Generator();

	public Hospital(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Regional Hospital";
		}
		this.ordinatories[0] = new Cardiology();
		this.ordinatories[1] = new Ortopedy();
		this.ordinatories[2] = new Virosology();

		employDoctors();
		employNurses();
	}

	public void dailyPlan() {
		for (Patient patientToGo : releaseList) {
			releasePatient(patientToGo);
		}
		releaseList = new ArrayList<>();
		for (Nurse nurse : nurses) {
			nurse.visit();
		}
		for (Doctor doctor : doctors) {
			doctor.visit();
		}

	}

	public void registerPatient(Patient p) {
		p.setFolder();
		if (!assignDoctor(p)) {
			System.out.println("No available doctor now. Please come again tomorrow or try in another hospital. \n");
			// waitingList.add(p);
		} else {
			hospitilize(p);

		}
	}

	public void releasePatient(Patient p) {
		p.getFolder().getRoom().emptyBed(p);
		p.getFolder().getDoctor().getPatients().remove(p);
		System.out.printf("Patient %s from gender %c with diagnose %s was released \n", p.getName(), p.getGender(),
				p.getPlan().getDiagnosis());
	}

	private boolean hospitilize(Patient p) {

		String diagnose = p.getPlan().getDiagnosis();
		for (int i = 0; i < ordinatories.length; i++) {
			if ((ordinatories[i].getType()).equals(diagnose)) {
				p.setOrdinatory(ordinatories[i]);
				break;
			}
		}
		if (p.getOrdinatory() == null) {
			System.out.println("This hospital can not cure this problem! \n");
			return false;
		} else {
			int idxRoom = p.getOrdinatory().idxAvailableRoom(p);
			if (idxRoom >= 0) {
				p.getFolder().setHospital(this);
				p.getFolder().setRoom(p.getOrdinatory().rooms[idxRoom]);
				p.getFolder().getRoom().placePatient(p);

			} else {
				System.out.println("No available beds in the hospital. Come again tommorow! ");
				return false;
			}
		}
		return true;
	}

	boolean assignDoctor(Patient p) {
		for (int i = 0; i < doctors.size(); i++) {
			if (!doctors.get(i).isBusy()) {

				p.getFolder().setDoctor(doctors.get(i));
				doctors.get(i).addPatient(p);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Doctor> getdoctors() {
		return doctors;
	}

	public ArrayList<Nurse> getNurses() {
		return nurses;
	}

	public Ordinatory[] getOrdinatories() {
		return ordinatories;
	}

	public String getName() {
		return name;
	}

	private void employNurses() {
		for (int i = 0; i < 3; i++) {
			int n = 100000 + r.nextInt(900000);
			String phone = Integer.toString(n);
			Nurse nurse = new Nurse(g.genName(), phone, 1 + r.nextInt(30));
			if (i <= 1) {
				this.nurses.add(nurse);
				nurse.setOrdinatory(this.getOrdinatories()[0]);
			} else if (i <= 3) {
				this.nurses.add(nurse);
				nurse.setOrdinatory(this.getOrdinatories()[1]);
			} else if (i <= 6) {
				this.nurses.add(nurse);
				nurse.setOrdinatory(this.getOrdinatories()[2]);
			}
		}
	}

	private void employDoctors() {
		for (int i = 0; i < 6; i++) {
			int n = 100000 + r.nextInt(900000);
			String phone = Integer.toString(n);
			if (i <= 1) {
				this.doctors.add(new Doctor(g.genName(), phone, this.ordinatories[0].toString()));
			} else if (i <= 3) {
				this.doctors.add(new Doctor(g.genName(), phone, this.ordinatories[1].toString()));
			} else if (i <= 6) {
				this.doctors.add(new Doctor(g.genName(), phone, this.ordinatories[2].toString()));
			}
		}

	}

	public ArrayList<Patient> getReleaseList() {
		return releaseList;
	}
}
