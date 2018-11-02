package kosta.mission;

import java.util.Scanner;

public class Mission10 {

	static String subject[] = {"번호", "국어", "영어", "수학", "총점", "평균" };
	static int score[][];
	static int n;
	
	public static void main(String args[]) {
		
		System.out.print("사람 수 : ");
		Scanner sc = new Scanner( System.in );
		
		score = new int[n][6];
		for (int i = 0; i < n; i++) {
			System.out.println("============" +( i + 1) + "번째 학생============");
			score[i][0] = i + 1;
			score[i][1] = getInput("국어");
			score[i][2] = getInput("영어");
			score[i][3] = getInput("수학");
			score[i][4] = getSum(i);
			score[i][5] = getAverage(i);
		}
		
		for(int i = 0; i < n - 1; i++)
			for(int j = i + 1; j < n; j++)
				if(score[i][5] < score[j][5]) swap(score, i, j );
		
		System.out.println("============계산 결과============");
		
		for(int i = 0; i < subject.length; i ++)
			System.out.print( subject[i] + "\t");
		System.out.println();
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < subject.length; j ++) {
				if( j == 5 ) {
					System.out.println( score[i][j] / 100.0f + "\t");
					break;
				}
				System.out.print(score[i][j] + "\t");
			}
		}

	}

	public static int getInput(String sub) {

		int score;
		
		System.out.print(sub + " 점수 입력 : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();

		return score;
	}
	
	public static int getSum(int idx) {

		int sum = 0;
		
			for(int i = 1; i < 4; i++ )
				sum += score[idx][i];

		return sum;
	}
	
	public static int getAverage(int idx) {

		float average = 0;
		
		average = score[idx][4] / 3.0f;

		return (int) (average * 100);
	}

	public static void swap(int[][] arr, int idx1, int idx2) {

		int temp[] = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

	}
	
}
