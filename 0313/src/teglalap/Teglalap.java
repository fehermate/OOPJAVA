package teglalap;

public class Teglalap {
	private int a;
	private int b;
	
	public Teglalap(int aIn, int bIn){ //Kontruktor neve = Osztály neve
		a = aIn;
		b = bIn;
	}
	
	public Teglalap(int sideIn){ //Kontruktor neve = Osztály neve
		a = sideIn;
		b = sideIn;
	}
	
	public int getTerulet(){
		return a * b;
	}
	
	public String getAdatok() {
		return "a_oldal: " + a + " " + "b_oldal: " + b + " " + "Területe: " + getTerulet();
	}
	
	public void setOldalak(int aIn, int bIn){
		a = aIn;
		b = bIn;
	}
	
	public void setOldal(int sideIn){
		a = sideIn;
		b = sideIn;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public boolean compare(Teglalap other){
		if (getTerulet() > other.getTerulet()) 
			return true;
		else return false;
	}
	
	public boolean equal(Teglalap other){
		if (a == other.a && b == other.b) 
			return true;
		else return false;
	}
	
	
	
}
