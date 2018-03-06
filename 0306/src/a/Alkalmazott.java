package a;

public class Alkalmazott {
	private String name;
	private int payment;

	public void fizNov(int fizBe) {
		payment += fizBe;
	}

	public String szovegVissza() {
		return "Nev: " + name + " Fizetes: " + payment;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPayment(){
		return payment;
	}
	
	public void setName(String nameIn){
		name = nameIn;
	}
	
	public void setPayment(int paymentIn){
		payment = paymentIn;
	}
	
	public boolean fizHatar(int lower, int upper) {
		if (payment >= lower && payment <= upper){
			return true;
		}
		return false;
	}
	
	public double getAdo(){
		return payment * (0.16);
		
	}
	
	public boolean nagyobbE(Alkalmazott a){
		if(payment > a.payment)
			return true;
		return false;
		
	}
	
}
