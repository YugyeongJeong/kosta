package kosta.mission;

import java.util.Scanner;

public class Mission01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("전화 : ");
		String phone = sc.nextLine();
		
		/*String name = "정유경";
		int age = 27;
		String address = "서울특별시 송파구";
		String phone = "01012341234";*/
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("address : " + address);
		System.out.println("phone : " + phone);
		
	}
}
