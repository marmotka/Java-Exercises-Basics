package documents;

import java.util.Random;

import Misc.Generator;
import persons.Patient;

public class Plan {

	private String diagnosis;
	private String medicines;
	private int period;
	private int leftDaysOfTreatment;
	private boolean isPlanFinished;
	private Patient patient;

	Generator g = new Generator();
	Random r = new Random();

	public Plan(Patient patient) {
		this.patient = patient;
		diagnosis = g.genDiagnosis();
		this.medicines = g.getMedicines();
		this.period = r.nextInt(3) + 3;
		this.leftDaysOfTreatment = period;
		isPlanFinished = false;
	}

	public int getLeftDaysOfTreatment() {
		return leftDaysOfTreatment;
	}

	public void setLeftDaysOfTreatment(int leftDaysOfTreatment) {
		if (leftDaysOfTreatment > 0) {
			this.leftDaysOfTreatment = leftDaysOfTreatment;
		} else {
			if (!this.patient.getFolder().getHospital().getReleaseList().contains(this.patient)) {
				isPlanFinished = true;
				System.out.printf(
						"\n *** Good news for %s - last day of treatment! Has to be released tomorrow! *** \n",
						this.patient.getName());

				this.patient.getFolder().getHospital().getReleaseList().add(this.patient);
			}
		}
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public String getMedicines() {
		return medicines;
	}

	public int getPeriod() {
		return period;
	}

	public void printPlan() {
		System.out.println("Patient " + this.patient.getName() + " with diagnose " + this.diagnosis
				+ " is planned to be treated with " + this.medicines + " for " + this.leftDaysOfTreatment
				+ " days! \n");
	}
}
