package kosta.mission;

import java.util.Scanner;

public class Mission11 {

	static final int MAX = 100;
	static String scores[][] = new String[MAX][6];
	static String subjects[] = { "성명", "국어", "영어", "수학", "총점", "평균" };
	static Scanner sc = new Scanner(System.in);
	static int cnt = 0;

	public static void main(String args[]) {

		int menu = -1;

		while (menu != 0) {
			System.out.println("================================");
			System.out.println("1.추가, 2.전체출력, 3.검색, 0.종료");
			System.out.print("입력 : ");
			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println("=============추가 선택=============");
				inputData();
				break;
			case 2:
				System.out.println("=============출력 선택=============");
				sort();
				printTitles();
				for (int i = 0; i < cnt; i++)
					outputData(i);
				break;
			case 3:
				System.out.println("=============검색 선택=============");
				searchData();
				break;
			case 0:
				System.out.println("============프로그램 종료============");
				return;
			}
		}
	}

	static void inputData() {

		for (int i = 0; i < subjects.length - 2; i++) {
			System.out.print(subjects[i] + " 입력 : ");
			scores[cnt][i] = sc.nextLine();
		}
		scores[cnt][4] = getSum(cnt);
		scores[cnt][5] = getAverage(cnt);
		cnt++;

	}

	public static String getSum(int idx) {

		int sum = 0;

		for (int i = 1; i < 4; i++)
			sum += Integer.parseInt(scores[idx][i]);

		return Integer.toString(sum);
	}

	public static String getAverage(int idx) {

		float average = 0;

		average = Integer.parseInt(scores[idx][4]) / 3.0f;

		return Integer.toString((int) (average * 100));
	}

	public static void swap(String[][] scores, int idx1, int idx2) {

		String temp[] = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;

	}

	public static void outputData(int i) {

		for (int j = 0; j < subjects.length; j++) {
			if (j == 5) {
				System.out.println(Integer.parseInt(scores[i][j]) / 100.0f + "\t");
				break;
			}
			System.out.print(scores[i][j] + "\t");
		}
	}

	public static void printTitles() {

		for (int i = 0; i < subjects.length; i++)
			System.out.print(subjects[i] + "\t");
		System.out.println();

	}

	public static void sort() {

		for (int i = 0; i < cnt - 1; i++)
			for (int j = i + 1; j < cnt; j++)
				if (Integer.parseInt(scores[i][5]) < Integer.parseInt(scores[j][5]))
					swap(scores, i, j);

	}

	public static void searchData() {

		System.out.print("성명 입력 : ");
		String name = sc.nextLine();

		for (int i = 0; i < cnt; i++) {
			if (scores[i][0].equals(name.trim())) {
				printTitles();
				outputData(i);
			}
		}
	}

}
