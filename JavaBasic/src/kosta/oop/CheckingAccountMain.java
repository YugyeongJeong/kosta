package kosta.oop;

public class CheckingAccountMain {

	public static void main(String[] args) {
//		CheckingAccount ca = new CheckingAccount("2222-222", "공지철", 1000, "2222");
//
//		ca.deposit(1000);
//		System.out.println(ca.balance);
//
//		ca.withdraw(1000);
//		System.out.println(ca.balance);
//
//		try {
//			int paidAmount = ca.pay("2222", 2000);
//			System.out.println("지불액 : " + paidAmount);
//			System.out.println("잔액 : " + ca.balance);
//		} catch (Exception e) {
//			String msg = e.getMessage();
//			System.out.println(msg);
//		}

		/*CreditAccount credit = new CreditAccount("2222-222", "공지철", 1000, "2222", -2000);

		try {
			System.out.println("결제전 잔액 : " + credit.balance);
			int paidAmount = credit.pay("2222", 3000);
			System.out.println("지불액 : " + paidAmount);
			System.out.println("결제후 잔액 : " + credit.balance);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}*/
		
		Account a = new CheckingAccount();
		//a.pay();
		CheckingAccount ca = (CheckingAccount)a;
		
		
	}

}
