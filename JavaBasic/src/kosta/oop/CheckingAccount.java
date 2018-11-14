package kosta.oop;

public class CheckingAccount extends Account {

	String cardNo;
	
	public CheckingAccount() {}

	public CheckingAccount(String accountNum, String name, int balance, String cardNo) {
		super(accountNum, name, balance);
		this.cardNo = cardNo;
	}

	int pay(String CardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		
		return withdraw(amount);
	}

}