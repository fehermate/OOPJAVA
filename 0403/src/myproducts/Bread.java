package myproducts;


public class Bread extends Product {
	private double amount;
	
	public Bread(String name, int netPrice, int percentage,double amount) {
		super(name,netPrice,percentage);
		this.amount = amount;
	}
	
	public double getBreadPrice() {
		return (this.getGrossPrice() / this.amount);
	}
	
	public String toString() {
		return super.toString() + " Egység ár: " + (this.getGrossPrice() / this.amount);
	}
	
	public double amountRet(){
		return this.amount;
	}
	
	public static boolean BreadPriceCompare(Bread b1, Bread b2){ //static miatt lesz osztályszintű
		if (b1.getBreadPrice() > b2.getBreadPrice())
			return true;
		else return false;
	}
	
}
