package kosta.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.println("평균 : " + sum);
		System.out.println("총점 : " + average);		

	}

}
