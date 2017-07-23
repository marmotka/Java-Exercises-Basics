package CarShop;

public class CarShop {

	Car[] list;
	private int addedCars;

	public CarShop(int capacity) {
		if (capacity > 0) {
			list = new Car [capacity];
			addedCars=0;
		}
	}
	
	
	boolean addCar (Car car){
		list[addedCars++]=car;
		System.out.printf("Model %s added in the shop list", car.getModel());
		return true;
	}
	
//	Car getNextCar(){
//		return list[this.list]
//	}
	
	
	
}
