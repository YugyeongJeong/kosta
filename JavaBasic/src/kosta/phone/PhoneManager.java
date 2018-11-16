package kosta.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	
	public void sort() {

		Collections.sort(list, new Comparator<PhoneInfo>(){

			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if(o1.getName().compareTo(o2.getName()) > 0)
					return -1;
				else if(o1.getName().compareTo(o2.getName()) < 0)
					return 1;
				return 0;
			}
			
		});

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

	void write() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneInfo.ser"));
			for(int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	ArrayList<PhoneInfo> read() {
		ObjectInputStream ois = null;
		FileInputStream fs= null;
		ArrayList<PhoneInfo> pi = new ArrayList<>();
		PhoneInfo p = new PhoneInfo();
		try {
			fs = new FileInputStream("phoneInfo.ser");
			ois = new ObjectInputStream(fs);
			
			while(fs.available() > 0) {
				p = (PhoneInfo)ois.readObject();
				pi.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return pi;
	}
}
