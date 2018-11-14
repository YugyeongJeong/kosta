package kosta.bank;

public class MyBank {
	
	private Customer[] customers;
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
//		customersNum = 0;
	}
	
	public void addCustomer(String ID, String name, long balance) {
		
		customers[customersNum++] = new Customer(ID, name, balance);
		
	}
	
	public int getCustomerNum() {
		return this.getCustomerNum();
	}
	
	public Customer getCustomer(String ID) {
		
		int i;
		
		for(i = 0; i < customersNum; i++)
			if(customers[i].getID().equals(ID))
				break;
		
		return this.customers[i];
	}

	public Customer[] getAllCustomers() {
		
		Customer[] allCust = new Customer[customersNum];
		
		for(int i = 0; i < allCust.length; i++)
			allCust[i] = customers[i];
		
		return allCust;
	}
	
}
