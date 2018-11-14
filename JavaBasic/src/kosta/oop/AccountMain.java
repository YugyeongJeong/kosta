package kosta.oop;

public class AccountMain {

	public static void main(String args[]) {

		Account a = new Account("1234", "공지철", 1000000);
		Account b = new Account("1234", "공지철", 1000000);

//		a.deposit(100000);
//		a.withdraw(50000);
//		System.out.println(a.toString());
		
		if(a.equals(b))
			System.out.println("같다");
		else
			System.out.println("다르다.");
		
		printDouble(new Double(123.24));
		printDouble(123.45);
	}

	private static void printDouble(Double obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
	}

}
