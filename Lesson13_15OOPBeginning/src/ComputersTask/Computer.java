package ComputersTask;

public class Computer {
	private String name;
	private int year;
	boolean isNotebook;
	private double price;
	String operationSystem;
	private double hardDiskMemory;
	private double freeMemory;

	Computer() {
		name = "PC";
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(String name, int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		setName(name);
		setYear(year);
		setPrice(price);
		setHardDiskMemory(hardDiskMemory);
		setFreeMemory(freeMemory);
	}

	Computer(String name, int year, double price, boolean isNotebook, double harDiskMemory, double freeMemory,
			String operationSystem) {
		setName(name);
		setYear(year);
		setPrice(price);
		this.isNotebook = isNotebook;
		setHardDiskMemory(hardDiskMemory);
		setFreeMemory(freeMemory);
		this.operationSystem = operationSystem;

	}

	int comparePrice(Computer c) {
		if (this.getPrice() > c.getPrice()) {
			System.out.printf("%s is more expensive than %s%n", this.getName(), c.getName());
			return -1;
		} else if (this.getPrice() == c.getPrice()) {
			System.out.printf("%s and %s have equal prices%n", this.getName(), c.getName());
			return 0;
		} else {
			System.out.printf("%s is more expensive than %s%n", c.getName(), this.getName());
			return 1;
		}
	}

	@Override
	public String toString() {
		String computerInfo = String.format(
				"The %s is made %d year; price is %.2f, I have to ask if it's notebook.. the answer is - %b. The Hard Disk has %.2f memory , %.2f free memory and operation system is %s %n",
				this.getName(), this.getYear(), this.getPrice(), this.isNotebook(), this.getFreeMemory(),
				this.getHardDiskMemory(), this.getOperationSystem());
		return computerInfo;
	}

	public boolean isNotebook() {
		return isNotebook;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	void changeOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	void useMemory(double memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough memory");
		} else {
			this.freeMemory = this.freeMemory - memory;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1990 && year <= 2017) {
			this.year = year;
		} else {
			System.out.println("Invalid year");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public double getHardDiskMemory() {
		return this.hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory2) {
		if (hardDiskMemory2 > 31) {
			this.hardDiskMemory = hardDiskMemory2;
		}
	}

	public void setFreeMemory(double freeMemory) {
		if (freeMemory > 31) {
			this.freeMemory = freeMemory;
		}
	}

	public double getFreeMemory() {
		return this.freeMemory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && name.length() > 0)
			this.name = name;
	}

}
