package kosta.oop;

public class PhoneMain {

	public static void main(String args[]) {
		int idx;

		PhoneManager man = new PhoneManager();
		man.pi[PhoneManager.cnt++] = new PhoneInfo("공지철", "01012341111", "2018-11-05");
		man.pi[PhoneManager.cnt++] = new PhoneInfo("박서준", "01012342222", "2018-11-05");

		// 삽입 연산
		PhoneInfo p = new PhoneInfo("박보검", "01012343333", "2018-11-05");
		man.insert(p);

		// 전체 출력
		System.out.println("===============출력================");
		for (int i = 0; i < PhoneManager.cnt; i++)
			man.print(i);

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
		for (int i = 0; i < PhoneManager.cnt; i++)
			man.print(i);
	
	}

}
