package abstr;

public class Henger extends Hasab {
	private double radius;
	public Henger(int radius, int height){
		super(height);
		this.radius = radius;
	}
	
	@Override
	public double baseArea(){
		return Math.pow(radius, 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		return "A henger adatai: [Sugár: " + this.radius + " Magasság: " + super.getHeight() + "]";
	}
	
}
