package TelephoneCalls;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	boolean validNumber(String simMobileNumber) {
		String simMobileNumberText = simMobileNumber.toString();
		return !simMobileNumberText.matches("08\\d{8}") ? false : true;
	}

	void insertSimCard(String simMobileNumber) {
		if (!validNumber(simMobileNumber)) {
			System.out.println("Invalid phone number!");
			return;
		}
		hasSimCard = true;
		this.simMobileNumber = simMobileNumber;

	}

	void removeSimCard() {
		hasSimCard = false;
	}

	void call(GSM receiver, int duration) {
		if (this.hasSimCard && receiver.hasSimCard && !this.simMobileNumber.equals(receiver.simMobileNumber)
				&& (duration > 0 && duration <= 60)) {

			this.lastOutgoingCall.duration = duration;
			receiver.lastIncomingCall.duration = duration;

			this.lastOutgoingCall.receiver = receiver.simMobileNumber;
			 lastOutgoingCall.caller = this.simMobileNumber;

			 receiver.lastIncomingCall.caller = this.simMobileNumber;
			receiver.lastIncomingCall.receiver = this.simMobileNumber;

			this.outgoingCallsDuration += duration;

		}
	}

	double getSumForCall() {
		return 0.1 * outgoingCallsDuration * lastIncomingCall.priceForAMinute / 0.1;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.printf("Last outgoing call: %s <-> %s ; duration is %d: ", model,
					lastOutgoingCall.caller.toString(), lastOutgoingCall.duration);

		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.printf("Last incoming call: %s <-> %s ; duration is %d: ", model,
					lastIncomingCall.caller.toString(), lastIncomingCall.duration);

		}
	}

	
	
}
