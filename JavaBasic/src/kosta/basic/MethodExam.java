package kosta.basic;

import java.util.Scanner;

public class MethodExam {

	private static int arr2[] = new int[3];
	private static int sum;
	private static float avg;

	public static void main(String args[]) {

		for (int i = 0; i < arr2.length; i++)
			arr2[i] = getScore();
		sum = getSum();
		avg = getAverage();
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		
	}

	public static int getScore() {

		int score;

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();

		return score;

	}

	public static int getSum() {

		for (int i = 0; i < arr2.length; i++)
			sum += arr2[i];

		return sum;

	}

	public static float getAverage() {

		return sum / 3.0f;

	}
}
