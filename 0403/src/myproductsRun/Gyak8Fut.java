package myproductsRun;


import myproducts.Product;
import myproducts.Bread;


public class Gyak8Fut {

	public static void main(String[] args) {
		Product p1 = new Product("Product1", 100, 27);
		Bread b1 = new Bread("Kenyér", 200, 27, 2);
		System.out.println(p1.toString());
		System.out.println(b1.toString());

		int priceCompare = p1.productCompare(b1);
		if (priceCompare == 1)
			System.out.println("A p1 ára a nagyobb.");
		else if (priceCompare == -1)
			System.out.println("A b1 ára a nagyobb.");
		else
			System.out.println("A két ár megegyezik.");
		
		System.out.println("");

//		Bread product2 = (Bread) new Product("Kenyér2", 150, 20);
//		System.out.println(product2.toString());
		
		Bread b2 = new Bread("Kenyéér", 150, 100, 2);
		Product product2 = b2;
		
		System.out.println(product2.toString());
		
		System.out.println("");
		
		Bread bread2 = new Bread("Bread2yes", 200, 100, 4);
		
		boolean res = Bread.BreadPriceCompare((Bread)product2,bread2);
		if(res)
			System.out.println("A product2 ára a nagyobb.");
		else
			System.out.println("A bread2 ára a nagyobb.");
		
		
		
	}
}
