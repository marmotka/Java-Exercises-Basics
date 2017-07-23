package TelephoneCalls;

public class Demo {
	public static void main(String[] args) {

		GSM dad = new GSM();
		GSM mom = new GSM();

		dad.model = "Nokia";	
		dad.insertSimCard("0889123456");
		mom.model = "Ericson";
		mom.insertSimCard("0888654321");

		dad.lastIncomingCall = new Call();
		dad.lastOutgoingCall = new Call();

		mom.lastIncomingCall = new Call();
		mom.lastOutgoingCall = new Call();
		dad.call(mom, 3);
		mom.call(dad, 30);

		dad.printInfoForTheLastOutgoingCall();
		System.out.println();
		dad.printInfoForTheLastIncomingCall();
		System.out.println();
		mom.printInfoForTheLastOutgoingCall();
		System.out.println();
		mom.printInfoForTheLastIncomingCall();

	}

}
