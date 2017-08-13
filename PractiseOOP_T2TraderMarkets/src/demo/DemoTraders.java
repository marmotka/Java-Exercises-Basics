package demo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

import salesPoints.MallPoint;
import salesPoints.MarketPoint;
import salesPoints.SalePoint;
import salesPoints.StreetPoint;
import suppliers.Retailer;
import suppliers.Supplier;
import suppliers.WholeSale;
import traders.Ambulant;
import traders.Chain;
import traders.EtTrader;
import traders.Trader;

public class DemoTraders {
	static Random rn = new Random();

	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Supplier> suppliersList = new ArrayList<Supplier>();
		ArrayList<SalePoint> salePoints = new ArrayList<SalePoint>();
		ArrayList<Trader> traders = new ArrayList<Trader>();
		// ArrayList<Supplier> suppliersList = new ArrayList<>();
		// ArrayList<Supplier> suppliersList = new ArrayList<>();
		LocalTime workTime = LocalTime.of(20, 30);

		int idx = 0;
		for (int i = 0; i < 10; i++) {
			Supplier sup;

			if (r.nextBoolean()) {
				suppliersList.add(new Retailer("Retailer" + i, "address" + i, workTime));
			} else {
				suppliersList.add(new WholeSale("WholeSale" + i, "address" + i, workTime));
			}
		}

		for (int i = 0; i < 20; i++) {
			int rnd = r.nextInt(3);
			switch (rnd) {
			case 0:
				salePoints.add(new MallPoint("Mall" + i, "address" + i, workTime));
				break;
			case 1:
				salePoints.add(new MarketPoint("MarketPoint" + i, "address" + i, workTime, r.nextInt(5) + 5));
				break;
			case 2:
				salePoints.add(new StreetPoint("StreetPoint" + i, "address" + i, workTime));
				break;

			}
		}

		Ambulant ambu = new Ambulant("Pesho Trades", "Vitohka 11", 100);
		EtTrader et = new EtTrader("Et pesho", "Vasil Levski 12", 500);
		Chain chain = new Chain("Free for all", "bul Nowhere 13", 3000);
		traders.add(et);
		traders.add(ambu);
		traders.add(chain);

		for (SalePoint salePoint : salePoints) {
			traders.get(r.nextInt(traders.size())).addPointOfSale(salePoint);
		}
		int i = 0;
		for (Supplier supplier : suppliersList) {
			if (i == 3) {
				i = 0;
			}
			traders.get(i++).getSuppliers().add(supplier);

		}

		trading(traders);

		int maxSales = 0;
		double maxTaxes = 0;
		String nameBestTrader = "";
		String nameTraderMaxTaxes = "";

		for (Trader trader : traders) {
			int sales = 0;

			for (SalePoint pointSale : trader.getSalePoints()) {
				sales += pointSale.getNumberProductsSaled();
			}
			if (sales > maxSales) {
				maxSales = sales;
				nameBestTrader = trader.getName();
			}
			if (trader.getPayedTaxes() > maxTaxes) {
				maxTaxes = trader.getPayedTaxes();
				nameTraderMaxTaxes = trader.getName();
			}

		}

		System.out.printf("Best trader: '%s' with selled products : %d \n", nameBestTrader, maxSales);
		System.out.printf(" trader '%s' payed max taxes:   %.2f \n", nameTraderMaxTaxes, maxTaxes);
	}

	public static void trading(ArrayList<Trader> tyrgovci) {
		for (Trader trader : tyrgovci) {
			for (SalePoint pointSale : trader.getSalePoints()) {
				trader.makeOrder(trader.getSuppliers().get(rn.nextInt(trader.getSuppliers().size())), pointSale);
				try {
					Thread.sleep(500); // 1000 milliseconds is one second.
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				pointSale.calcDaySales();
				try {
					Thread.sleep(200); // 1000 milliseconds is one second.
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				pointSale.showMoney();
				trader.takeCashOfSalePoint(pointSale);
				trader.payTaxes(pointSale);

			}
		}
	}

}
