package polynomial;

public class LinearPolynomial implements math.IPolynomial{
	private double a;
	private double b;
	
	public LinearPolynomial(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getY(double x) {
		return this.a * x + this.b;
	}

	@Override
	public int getGrade() {
		return 1;
	}

	@Override
	public String toString() {
		if(this.b==0)
			return "y=" + this.a + "x+" + 0;
		else if(this.b>0)
			return "y=" + this.a + "x+" + this.b;
		else
			return "y=" + this.a + "x" + this.b;
	}

	
	
}
