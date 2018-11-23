	package kosta.MyCar;
	
	import java.util.Scanner;
	
	
	public class Main {
		static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			User u = new User();		//User객체 생성
	
			u.input();	//차스펙 입력메소드
			
			while (true) {
				System.out.println("1. 내 기록\t2.최신 구간연비 \t 3.월통계\t4.종료");
				System.out.print("메뉴입력 : ");
				int a = sc.nextInt();
				sc.nextLine();
	
				switch (a) {
				case 1:
					u.record();		//내기록입력 메소드
					break;
				case 2:
					u.fragEff();	//구간연비 메소드
					break;
				case 3:
					u.statis();		//통계 메소드
					break;
				case 4:
					System.out.println("종료");
					return;
	
				}
	
			}
		}
	}