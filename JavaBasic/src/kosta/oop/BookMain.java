package kosta.oop;

public class BookMain {
	
	public static void main(String args[]) {
		
		Book b1 = new Book("JAVA", 30000);
		Book b2 = new Book("JSP", 20000);
		Book b3 = new Book("Oracle", 15000);
		
		b1.setiDscountedPrice();
		b1.outputBook();
		
		b2.setiDscountedPrice();
		b2.outputBook();
		
		b3.setiDscountedPrice();
		b3.outputBook();
	}

}
