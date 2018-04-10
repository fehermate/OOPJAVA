package abstr;

public class Teglatest extends Hasab {
	private double side_a;
	private double side_b;
	
	public Teglatest(double side_a, double side_b, int height){
		super(height);
		this.side_a = side_a;
		this.side_b = side_b;
	}
	
	@Override
	public double baseArea() {
		return side_a * side_b;
	}
	
	@Override
	public String toString() {
		return "A téglatest adatai: [A oldal: " + this.side_a + " B oldal: " + this.side_a + "Magasság: " + super.getHeight() + "]";
	}
}
