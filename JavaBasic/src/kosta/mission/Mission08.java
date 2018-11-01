package kosta.mission;

import java.util.Scanner;

public class Mission08 {

	public static void main(String args[]) {

		// 3과목의 합계와 평균

		String subjects[] = { "국어", "영어", "수학" };
		int arr[] = null;

		arr = getHeight(arr, subjects);
		arr[3] = getTotal(arr);
		arr[4] = getAverage(arr);

		System.out.println("합계 : " + arr[3]);
		System.out.println("평균 : " + arr[4] / 100.0);

	}

	static int getAverage(int arr[]) {

		int total =getTotal(arr);

		return (int) (total / 3.0 * 100);
	}

	static int getTotal(int arr[]) {

		int total = 0;

		for (int i = 0; i < arr.length - 2; i++)
			total += arr[i];

		return total;
	}

	public static int[] getHeight(int arr[], String subjects[]) {

		Scanner input = new Scanner(System.in);

		arr = new int[5];
		for (int i = 0; i < arr.length - 2; i++) {
			System.out.print(subjects[i] + " 점수 입력 : ");
			arr[i] = input.nextInt();
		}

		return arr;
	}

}
