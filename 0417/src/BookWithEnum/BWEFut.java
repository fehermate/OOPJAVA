package BookWithEnum;

import BookWithEnum.BookWithEnum.style;
//import konyv.Konyv;
import java.util.Scanner;





public class BWEFut {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookWithEnum bArray[] = new BookWithEnum[3];
		style bookStyle = style.ROMANCE;
		
		for (int i = 0; i < bArray.length; i++) {
			System.out.println("Kérem a(z) " + i + ". könyv címét: ");
			String title = sc.next();
			
			System.out.println("Kérem a(z) " + i + ". könyv szerzőjét: ");
			String author = sc.next();
			
			System.out.println("Kérem a(z) " + i + ". könyv kiadási évét: ");
			int date = sc.nextInt();
			
			System.out.println("Kérem a(z) " + i + ". könyv árát: ");
			int price = sc.nextInt();
			
			System.out.println("Kérem a(z) " + i + ". könyv stílusát: ");
			String styleString = sc.next();
			
			if(styleString.contains("cook"))
				bookStyle = style.COOK;
			
			if(styleString.contains("romance"))
				bookStyle = style.ROMANCE;
			
			if(styleString.contains("scifi"))
				bookStyle = style.SCIFI;
			
			if(styleString.contains("other"))
				bookStyle = style.OTHER;
			
			bArray[i] = new BookWithEnum(title, author, date, price, bookStyle);
		}
		sc.close();
		
		getData(bArray);
		BookWithEnum[] bArray2 = new BookWithEnum[bArray.length];
		bArray2 = getBWE(bArray, style.SCIFI);
		getData(bArray2);

	}

	
	public static void getData(BookWithEnum[] bookArray){
		for (BookWithEnum b : bookArray){
			if (b != null)
				System.out.println(b.toString());
		}
	}
	
	public static BookWithEnum[] getBWE(BookWithEnum[] bweArray, style bookStyle){
		BookWithEnum[] bweTemp = new BookWithEnum[bweArray.length];
		
		for (int i = 0; i < bweArray.length;i++) {
			if(bweArray[i].getBookStyle().equals(bookStyle)){
				System.out.println("");
				bweTemp[i] = bweArray[i];
			}
			
			
		}
		return bweTemp;
	}
}
