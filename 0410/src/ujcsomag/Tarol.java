package ujcsomag;

import abstr.Hasab;
import abstr.Henger;

public class Tarol {
	private Hasab[] hasabArray;
	
	public Tarol(int size){
		this.hasabArray = new Hasab[size];
	}
	
	public void SetHasabRef(int index, Hasab h){
		this.hasabArray[index] = h;
	}
	
	public int getArraySize(){
		return this.hasabArray.length;
	}
	
	public Hasab getIndexoHasab(int index){
		return this.hasabArray[index];
	}
	
	public int getNotNullElements() {
		int db = 0;
		for(Hasab h : this.hasabArray){
			if(h != null)
				db++;
		}
		return db;
	}
	
	public double getHasabAverageVolume(){
		double sum = 0;
		for (Hasab h : this.hasabArray){
			if(h != null)
			sum = sum + h.getVolume();
		}
		
		return sum / this.hasabArray.length;
	}
	
	public int getHengerHasab(){
		int db = 0;
		for(Hasab h : this.hasabArray){
			if(h instanceof Henger)
				db++;
		}
		
		return db;
	}
}
