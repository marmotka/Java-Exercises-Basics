package persons;

public class Nurse extends Person {

	private int experience;

	public Nurse(String name, String phoneNumber, int yearsExperience) {
		super(name, phoneNumber);
		if (yearsExperience > 0) {
			this.experience = yearsExperience;
		}
	}

	int getExp() {
		return experience;
	}

	public void visit() {
		for (int i = 0; i < this.getOrdinatory().getRooms().length; i++) {
			for (int j = 0; j < this.getOrdinatory().getRooms()[i].getBeds().length; j++) {
				if (this.getOrdinatory().getRooms()[i].getBeds()[j] != null) {
					giveTreatment(this.getOrdinatory().getRooms()[i].getBeds()[j]);

				}
			}
		}
	}

	private void giveTreatment(Patient patient) {
		patient.getPlan().setLeftDaysOfTreatment(patient.getPlan().getLeftDaysOfTreatment() - 1);

		System.out.printf("Nurse %s gave medicine %s to patient %s in room %d in ordinatory %s. \n", this.getName(),
				patient.getPlan().getMedicines(), patient.getName(), patient.getRoomNumber(),
				patient.getOrdinatory().getType());

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
