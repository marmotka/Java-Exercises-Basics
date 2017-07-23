package Shop;

public class DemoShop {
	public static void main(String[] args) {
		
		Shop homeStore = new Shop(5);
		
		ProductByCount kafe = new ProductByCount("Jacobs", 3.2, 10);
		ProductByCount water = new ProductByCount("Devin", 1.3, 20);
		ProductByCount bread = new ProductByCount("Tipov", 0.9, 10);
		ProductByKilos tomatoes = new ProductByKilos("Pink Tomatoes", 1.2, 12.5);
		ProductByKilos onion = new ProductByKilos("Red Onion", 0.8, 15.5);
		
		homeStore.loadProducts(onion);
		homeStore.loadProducts(tomatoes);
		homeStore.loadProducts(bread);
		homeStore.loadProducts(water);;
		homeStore.loadProducts(kafe);
		
		homeStore.toString();
		
		Buyer pesho = new Buyer(homeStore, 10, 3);
		pesho.loadCart("Devin", 5);
		pesho.loadCart("Pink Tomatoes", 8);		
		pesho.loadCart("ala", 8);
		pesho.loadCart("Tipov", 2);
		
		pesho.toString();
		pesho.pay();
		
		pesho.unloadCart("Bira", 2);
		pesho.unloadCart("tipov", 3);
		pesho.unloadCart("tipov", 1);
		pesho.unloadCart("Devin", 3);
		pesho.unloadCart("Pink Tomatoes", 6);
		
		pesho.toString();
		pesho.pay();
		
		
	
		homeStore.toString();
	}
}
