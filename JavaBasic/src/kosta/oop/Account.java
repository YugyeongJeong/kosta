package kosta.oop;

public class Account {

	String accountNum;
	String name;
	int balance;

	public Account(String accountNum, String name, int balance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
	
	int deposit(int amount) {
		return balance += amount;
	}

	int withdraw(int amount) {
		return balance -= amount;
	}

}
