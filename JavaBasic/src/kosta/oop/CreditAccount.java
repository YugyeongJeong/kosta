package kosta.oop;

public class CreditAccount extends CheckingAccount {

	private int limit;

	public CreditAccount(String accountNum, String name, int balance, String cardNo, int limit) {
		super(accountNum, name, balance, cardNo);
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	int pay(String CardNo, int amount) throws Exception {

		if ( !cardNo.equals(this.cardNo) || balance + Math.abs(limit) < amount)
			throw new Exception("지불이 불가능합니다.");
		else {
			balance = 0 - Math.abs(balance - amount);
			return amount;
		}
		
	}

}
