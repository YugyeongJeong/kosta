package kosta.oop;

public class PhoneManager {

	PhoneInfo pi[];
	static int cnt = 0;

	PhoneManager() {

		pi = new PhoneInfo[10];

	}

	void insert(PhoneInfo p) {

		pi[cnt] = new PhoneInfo();
		pi[cnt] = p;

		cnt++;

	}

	void print(int i) {

		if (pi[i] != null)
			pi[i].outputPhoneNo();

	}

	int search(String name) {

		int i;

		for (i = 0; i < cnt; i++)
			if (pi[i] != null && pi[i].name.equals(name))
				break;

		return i;

	}

	void update(int i, PhoneInfo p) {

		pi[i] = p;

	}

	public void delete(int idx) {

		pi[idx] = null;

	}

}
