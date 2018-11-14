package kosta.phone;

import java.util.ArrayList;

public class PhoneManager {

	//PhoneInfo pi[];
	ArrayList<PhoneInfo> list;
	static int cnt = 0;

	PhoneManager() {

		list  = new ArrayList<>();
		//pi = new PhoneInfo[10];

	}

	void addPhoneInfo(PhoneInfo p) {
		
//		pi[list.size()++] = p;
		list.add(p);
		cnt++;

	}

	void print(int i ) {
		
//		if (pi[i] != null ) 
//			pi[i].outputPhoneNo();
		if(list.get(i) != null)
			list.get(i).outputPhoneNo();
		
	}
	
	void printUniverse(int i) {

//		if (pi[i] != null && pi[i] instanceof UniversePhoneInfo)
//			pi[i].outputPhoneNo();
		
		if(list.get(i) != null && list.get(i) instanceof UniversePhoneInfo)
			list.get(i).outputPhoneNo();

	}
	
	void printCompany(int i) {

//		if (pi[i] != null && pi[i] instanceof CompanyPhoneInfo)
//			pi[i].outputPhoneNo();
		
		if(list.get(i) != null && list.get(i) instanceof CompanyPhoneInfo)
			list.get(i).outputPhoneNo();

	}

	int search(String name) {

		int i;

		for (i = 0; i < cnt; i++) {
			//if (pi[i] != null && pi[i].getName().equals(name))
			if(list.get(i) != null && list.get(i).getName().equals(name))
				break;
		}

		return i;

	}

	void update(int i, PhoneInfo p) {

		//pi[i] = p;
		list.add(i, p);

	}

	public void delete(int idx) {

		//pi[idx] = null;
		list.remove(idx);

	}
	
	String toString(int i) {

		if(list.get(i) != null)
			return list.get(i).toString();
		else
			return null;
//		if (pi[i] != null)
//			 return pi[i].toString();
//		else
//			return null;
	}

}
