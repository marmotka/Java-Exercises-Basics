package documents;

import hospital.Hospital;
import hospital.Room;
import persons.Doctor;
import persons.Patient;

public class Folder {

	private Patient patient;
	private String patientInfo;
	// private char gender;
	// private int age;
	private Doctor doctor;
	private Room room;
	private Hospital hospital;

	public Folder(Patient patient) {
		this.patient = patient;

		this.patientInfo += "Name: " + patient.getName() + "\nAge: " + patient.getAge() + "\nGender: "
				+ patient.getGender() + "\nPhone number: " + patient.getPhoneNumber();
	}

	public void printFolder() {
		System.out.println("------------------");
		System.out.println(this.patientInfo);
		System.out.println("--- *** ---");
		if (hospital != null) {
			System.out.println("Hospital: " + hospital.getName());
		}
		if (doctor != null) {
			System.out.println("Doctor: " + doctor.getName());
		}
		if (room != null) {
			System.out.println("Ordinatory: " + patient.getOrdinatory().getType());
			System.out.println("Room: " + room.getNumber());
		}
		System.out.println("------------------");
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setHospital(Hospital bolnica) {
		this.hospital = bolnica;
	}

	public Room getRoom() {
		return room;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public Doctor getDoctor() {
		return doctor;
	}

}
