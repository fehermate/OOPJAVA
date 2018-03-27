package gyak06;

import java.time.LocalDate;

public class Alkalmazott2 {
	private String name;
	private int age;
	private int salary;
	
	private LocalDate DateofBirth;
	

	private static int ageLimit = 65;

	public Alkalmazott2(String name, LocalDate DateofBirth, int salary) {
		this.name = name;
		//this.age = age;
		this.DateofBirth = DateofBirth;
		this.salary = salary;
	}

	public int getAge() {
		return java.time.LocalDate.now().getYear() - DateofBirth.getYear();
	}
	
	public Alkalmazott2(String name, LocalDate DateofBirth) {
		this.name = name;
		//this.age = age;
		this.DateofBirth = DateofBirth;
		this.salary = age * 10000;
	}

	public int yearsLeft() {
		int yearsLeft = ageLimit - this.age;
		if (yearsLeft < 0)
			yearsLeft = 0;
		return yearsLeft;
	}

	public String toString() {
		return "Név:" + this.name + " Kor:" + this.age + " Fizetés:"
				+ this.salary + " Nyugdíjig hátralévő évek száma:"
				+ yearsLeft();
	}

	public static void setAgeLimit(int ageLimitIn) {
		ageLimit = ageLimitIn;
	}

	public Alkalmazott2 compareYearsLeft(Alkalmazott2 a1, Alkalmazott2 a2) {
		if (a1.yearsLeft() > a2.yearsLeft())
			return a1;
		else
			return a2;
	}

}
