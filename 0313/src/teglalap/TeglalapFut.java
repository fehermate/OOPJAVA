package teglalap;

public class TeglalapFut {

	
	public static void main(String[] args) {
		Teglalap a = new Teglalap(2,3);
		Teglalap b = new Teglalap(4,5);
		Teglalap c = a;
		
		System.out.println("A oldalai: " + a.getAdatok());
		System.out.println("B oldalai: " + b.getAdatok());
		System.out.println("C oldalai: " + c.getAdatok());
		
		a.setOldalak(10, 2);
		System.out.println("");
		
		System.out.println("Új A oldalai: " + a.getAdatok());
		System.out.println("Új B oldalai: " + b.getAdatok());
		System.out.println("Új C oldalai: " + c.getAdatok());
		
		a.setOldalak(b.getA(), b.getB());
		System.out.println("");
		
		System.out.println("Az a==b: " + (a==b));
		System.out.println("Az a==c: " + (a==c));
		
		System.out.println("");
		System.out.println("Az a==b metódussal: " + a.equal(b));
		
	}

}
