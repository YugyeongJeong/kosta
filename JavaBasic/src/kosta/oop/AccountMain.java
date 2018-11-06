package kosta.oop;

public class AccountMain {

	public static void main(String args[]) {

		Account a1 = new Account("1234", "공지철", 1000000);

		a1.deposit(100000);
		a1.withdraw(50000);
		System.out.println("계좌주 : " + a1.name);
		System.out.println("잔액 : " + a1.balance);
		
		
	}

}
