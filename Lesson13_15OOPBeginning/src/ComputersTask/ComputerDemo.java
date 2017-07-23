package ComputersTask;

public class ComputerDemo {
	public static void main(String[] args) {

		Computer pcHome = new Computer();
		Computer pcWork = new Computer("WorkPC", 2000, 1000, 1024, 512);
		Computer pcDad = new Computer("Daddy", 2015, 50, true, 64, 20, "Mac");

		pcHome.setPrice(500.5);
		pcHome.setHardDiskMemory(500);
		pcHome.setYear(2015);

		pcWork.changeOperationSystem("Linux");
		pcHome.useMemory(80);

		System.out.println(pcHome.toString());
		System.out.println(pcWork.toString());
		System.out.println(pcDad.toString());

		int resultCompPcHomePcWork = pcHome.comparePrice(pcWork);
		int resultCompPcDadPcHome = pcDad.comparePrice(pcHome);
	//	printResultCompare (resultCompare, pcWork);
	}

//	public static void printResultCompare(int resultCompare, Computer a) {   //why method should be static
//		if (resultCompare == -1) {
//			System.out.println(a.getName() + " is cheaper");
//		} else if (resultCompare == 0) {
//			System.out.printf("%s  has the same price", a.getName());
//		} else {
//			System.out.println(a.getName() + " is more expensive");
//		}
//	}

}
