package kosta.phone;

import java.util.ArrayList;

import java.util.ArrayList;

public class PhoneMain {

	public static void main(String args[]) {
		int idx;

		PhoneManager man = new PhoneManager();
		// man.pi[PhoneManager.cnt++] = new PhoneInfo("공지철", "01012341111",
		// "2018-11-05");

		// 삽입 연산
		PhoneInfo p = new PhoneInfo("공지철", "01012341111", "2018-11-05");
		UniversePhoneInfo up = new UniversePhoneInfo("박보검", "01012342222", "2018-11-05", "CS", 2011);
		UniversePhoneInfo up1 = new UniversePhoneInfo("박서준", "01012342222", "2018-11-05", "CS", 2011);
		CompanyPhoneInfo cp = new CompanyPhoneInfo("박서준03", "01012342222", "2018-11-05", "R&D", "researcher");
		CompanyPhoneInfo cp1 = new CompanyPhoneInfo("박서준04", "01012342222", "2018-11-05", "R&D", "researcher");
		man.addPhoneInfo(p);
		man.addPhoneInfo(up);
		man.addPhoneInfo(up1);
		man.addPhoneInfo(cp);
		man.addPhoneInfo(cp1);

		// 전체 출력
		System.out.println("===============출력================");
		for (int i = 0; i < man.list.size(); i++)
			System.out.println(man.toString(i));
		// for (int i = 0; i < phone.size(); i++)
		// System.out.println(man.toString(i));

		// 검색 연산
		System.out.println("===============검색================");
		idx = man.search("박보검");
		man.print(idx);

		// 수정 연산
		System.out.println("===============수정================");
		idx = man.search("공지철");
		p = new PhoneInfo("도깨비", "01012340000", "2018-11-05");
		man.update(idx, p);
		man.print(idx);

		// 삭제 연산 
		System.out.println("===============삭제================");
		idx = man.search("박서준");
		man.delete(idx);

		// 전체 출력
		 System.out.println("UniversePhoneInfo 출력");
		 for (int i = 0; i < PhoneManager.cnt; i++)
		 man.printUniverse(i);
		
		 System.out.println("CompanyPhoneInfo 출력");
		 for (int i = 0; i < PhoneManager.cnt; i++)
		 man.printCompany(i);

	}

}
