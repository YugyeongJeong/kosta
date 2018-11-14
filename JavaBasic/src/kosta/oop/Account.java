package kosta.oop;

public class Account {

	String accountNum;
	String name;
	int balance;

	public Account() {
	}

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
		balance -= amount;
		return amount;
	}

	@Override
	public String toString() {
		return "accountNum=" + accountNum + ", name=" + name + ", balance=" + balance + " ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNum == null) ? 0 : accountNum.hashCode());
		result = prime * result + balance;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		Account a = (Account) obj;

		if (obj instanceof Account) {
			if (accountNum.equals(a.accountNum))
				if (name.equals(a.name))
					if (balance == a.balance)
						return true;
		}
		// if (this == obj)
		// return true;
		// if (obj == null)
		// return false;
		// if (getClass() != obj.getClass())
		// return false;
		// Account other = (Account) obj;
		// if (accountNum == null) {
		// if (other.accountNum != null)
		// return false;
		// } else if (!accountNum.equals(other.accountNum))
		// return false;
		// if (balance != other.balance)
		// return false;
		// if (name == null) {
		// if (other.name != null)
		// return false;
		// } else if (!name.equals(other.name))
		// return false;
		// return true;
		// }
		return false;
	}

}
