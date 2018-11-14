package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListMission {

	static ArrayList<String> list = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	public static void add() {

		System.out.print("입력 : ");
		list.add(sc.nextLine());

	}

	public static void update() {

		System.out.print("수정할 값 : ");
		String str = sc.nextLine();
		System.out.print("새 데이터 : ");
		String str2 = sc.nextLine();

		for (int i = 0; i < list.size(); i++)
			if (list.get(i).equals(str))
				list.set(i, str2);

	}

	public static void show() {

		for (String s : list)
			System.out.println(s);
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + ",");
		}
		
	}

	public static void main(String args[]) {

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.종료");
			System.out.print("선택 : ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				add();
				show();
				break;
			case "2":
				update();
				show();
				break;
			case "3":
				System.out.print("삭제할 값 : ");
				String str = sc.nextLine();
				for (int i = 0; i < list.size(); i++)
					if (list.get(i).equals(str))
						list.remove(i);
				show();
				break;
			case "4":
				System.out.println("종료");
				return;
			}
		}

	}
}
