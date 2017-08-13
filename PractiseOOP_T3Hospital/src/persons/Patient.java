package persons;

import documents.Folder;
import documents.Plan;
import hospital.Hospital;

public class Patient extends Person {

	private char gender;
	private int age;
	private Folder folder;
	private Plan plan;

	public Patient(String name, String phoneNumber, char gender, int age) {
		super(name, phoneNumber);
		this.age = age;
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		} else {
			System.out.println("unknown gender! \n");
		}
	}

	public void visitHospital(Hospital hospital) {
		hospital.registerPatient(this);
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Plan getPlan() {
		return plan;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder() {
		this.folder = new Folder(this);

	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getRoomNumber() {
		return folder.getRoom().getNumber();
	}

}
