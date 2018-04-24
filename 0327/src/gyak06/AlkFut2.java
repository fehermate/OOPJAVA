package gyak06;


import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlkFut2 {

	
	public static void main(String[] args) {
		System.out.println("Kérem az alkalmazottak számát: ");
		
		Scanner sc = new Scanner(System.in);
		int numberOfEmp = sc.nextInt();
		Alkalmazott2[] alkok =  new Alkalmazott2[numberOfEmp];
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		for (int i = 0; i < alkok.length; i++) {
			System.out.println("Kérem az " + (i+1) + ".alkalmazott nevét: ");
			String name = sc.next();
			
			System.out.println("Kérem az " + (i+1) + ".alkalmazott korát: ");
			int age = sc.nextInt();
			
			System.out.println("Kérem az " + (i+1) + ".alkalmazott fizetését: ");
			int salary = sc.nextInt();
			
			//alkok[i] = new Alkalmazott2(name, age, salary);
			//alkok[i] = new Alkalmazott(name, age, salary);
			//alkok[i] = new Alkalmazott(name, DateofBirth, salary);
		}
		
		for(Alkalmazott2 a : alkok)
			System.out.println(a.toString());
		
		Alkalmazott2.setAgeLimit(72);
		
		System.out.println("---");
		
		for(Alkalmazott2 a : alkok)
			System.out.println(a.toString());
		
		System.out.println("---");
		
		System.out.println("Ezen alkalmazottaknak kevesebb, mint 5 év van hátra a nyugdíjig: ");
		
		for(Alkalmazott2 a : alkok)
			if (a.yearsLeft() < 5) 
				System.out.println(a.toString());
			
		System.out.println("---");
		System.out.println("Átlagnál nagyobb: ");
		
		int sum = 0;
		double average = 0.0;
		
		for (int i = 0; i < alkok.length; i++) {
			sum = sum + alkok[i].yearsLeft();
		}
		
		average = (double) sum /(double) alkok.length;
		
		for (Alkalmazott2 a : alkok){
			if(a.yearsLeft() > average)
				System.out.println(a.toString());
		}
		
		System.out.println("---");
		System.out.println("Növekvő sorrendben: ");
		Alkalmazott2[] sortedArray = new Alkalmazott2[alkok.length];
		Alkalmazott2 temp;
		for (int j = 0; j < alkok.length - 1; j++) {
			for (int i = 0; i < alkok.length - 1; i++) {
				if (alkok[i].yearsLeft() > alkok[i+1].yearsLeft()) {
					temp = alkok[i];
					alkok[i]=alkok[i+1];
					alkok[i+1]=temp;
					sortedArray = alkok;
				}
			}
		}
		
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i].toString());
		}
		
		System.out.println("---");
		System.out.println("Csökkenő sorrendben: ");
		for (int j = 0; j < alkok.length - 1; j++) {
			for (int i = 0; i < alkok.length - 1; i++) {
				if (alkok[i].yearsLeft() < alkok[i+1].yearsLeft()) {
					temp = alkok[i];
					alkok[i]=alkok[i+1];
					alkok[i+1]=temp;
					sortedArray = alkok;
				}
			}
		}
		
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i].toString());
		}
		
		sc.close();
	}

}
