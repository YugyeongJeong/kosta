package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	
	static int kor, eng, mat;
	static int sum, avg;

	public static int inputScore(String subject) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + " 성적을 입력하세요 : ");
		int score = sc.nextInt();
		
		return score;
	}
	
	public static int sum() {
		
		return kor + eng + mat;
	}
	
	public static int average() {
		
		return sum() / 3;
	}
	
	public static void main(String[] args) {
		
		kor = inputScore("국어");
		eng = inputScore("영어");
		mat = inputScore("수학");
		
		sum = sum();
		System.out.println(sum);
		avg = average();
		System.out.println(avg);
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 : ");
//		int korean = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("영어 : ");
//		int english = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("수학 : ");
//		int math = Integer.parseInt(sc.nextLine());
//		
//		int sum = korean + english + math;
//		double average = sum / 3.0;
//		
//		System.out.println("평균 : " + sum);
//		System.out.printf("총점 : %.2f\n", average);
		
//		if( average >= 90 )
//			System.out.println('A');
//		else if( average >= 80 )
//			System.out.println('B');
//		else if( average >= 70 )
//			System.out.println('C');
//		else
//			System.out.println('F');
	
		
		switch( (int)avg / 10) {
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		default:
			System.out.println('F');
		
		}

	}

}
